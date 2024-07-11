package lesson_39;

import org.junit.platform.engine.support.hierarchical.Node;

import java.util.*;

public class MyHashMap<K, V> implements InterfaceHashMap<K, V> {

    private Node<K, V>[] buckets;
    private int capacity = 16;
    private double loadFactor = 0.75;
    private int size;

    public MyHashMap() {
        this.buckets = (Node<K, V>[]) new Node[capacity];
    }

    /*
    1. Вычислить хэш-код ключа
    2. На основание хэш-кода определить индекс корзины в массиве
    3. Если в корзине нет элементов - положить новую пару ключ-значение
    4. Если в корзине есть элементы: пройти по цепочке проверить ключи на совпадение
    4.1. Если найден совпадающий ключ - обновить значение для этого ключа
    4.2. Если не найдено совпадений - приклеить новую пару в конец списка
     */
    @Override
    public V put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];

        while (current != null) {

            //Todo Обработать ситуацию key == null

            if (current.key.equals(key)) {
                current.value = value;
                return value;
            }

            // надо зафиксировать последнюю ноду, если она есть
            if (current.next == null) {
                break;
            }

            current = current.next;
        }

        // прошелся по списку (если он есть) - совпадений ключей не нашел

        // Создаю новую пару ключ-значение
        Node<K, V> newNode = new Node<>(key, value);

        // проверяем наличие хотя бы одного элемента в корзине
        if (current == null) {
            // значит под индексом пустая ячейка (п.3)
            buckets[index] = newNode;
        } else {
            // в ячейка была как минимум 1 нода. Надо приклеить новую ноду в конец цепочки (п 4.2)
            current.next = newNode;
        }

        size++;

        // проверка загрузки
        if (1.0 * size / capacity >= loadFactor) {
            resize();
        }
        return value;
    }

    /*
    1. Получить хэш ключа. Вычислить индекс.
    2. Проверить список в ячейке.
    3. Если в корзине пусто - вернуть null (не нашли такого ключа в карте)
    4. Если что-то есть - пройтись - поискать совпадение ключей. Если найдено - вернуть значение
    5. Если прошли по всему списку и не нашли совпадений - вернуть null
     */

    @Override
    public V get(Object key) {
        int index = key.hashCode() & (capacity - 1);

        Node<K, V> current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    /*
    1. Получить индекс по хэш-коду
    2. Пройтись по цепочке, проверить ключи на равенство
     */
    @Override
    public boolean containsKey(Object key) {
        int index = key.hashCode() & (capacity - 1);
        Node<K, V> current = buckets[index];
        while (current != null) {
            if (Objects.equals(current.key, key)) return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public void clear() {
        capacity = 16;
        buckets = (Node<K, V>[]) new Node[capacity];
        size = 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> keySet = new LinkedHashSet<>();

        for (Node<K, V> node : buckets) {
            if (node != null) {
                keySet.addAll(node.getKeysList());
            }
        }
        return keySet;
    }

    @Override
    public Collection<V> values() {
        Collection<V> valuesList = new ArrayList<>();

        for (Node<K, V> node : buckets) {
            if (node != null) {
                valuesList.addAll(node.getValuesList());
            }
        }
        return valuesList;
    }

    @Override
    public String toString() {
       /*
       1. Пройти по всем корзинам.
       2. Из каждой корзины добавить в строку список ее нод
        */
        StringBuilder sb = new StringBuilder("[");
        for (Node<K, V> node : buckets) {
            if (node != null) {
                sb.append(node.getList());
            }
        }
        return sb.append("]").toString();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        V value = get(key);
        if (value == null) {
            value = defaultValue;
        }
        return value;
    }

    private void resize() {
        // TODO реализовать метод увеличение числа корзин и перераспределения нод
    }

    private int getIndex(K key) {
//        int hashCode = key.hashCode();
//        int index = Math.abs(hashCode) % capacity;

        // Побитовое И (&)
        int index = key.hashCode() & (capacity - 1);
        return index;

        // capacity = 8 // 1000 -> 0111
        // hcode = 19 // 10011 (0..7)

        /*
        10011
      & 0111
      -------
        00011 -> 3
         */
    }

    private static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + " : " + value + "}";
        }

        public String getList() {
            Node<K, V> cursor = this;
            StringBuilder sb = new StringBuilder("[");
            while (cursor != null) {
                sb.append(cursor);
                sb.append(", ");
                cursor = cursor.next;
            }

            // Убираю ", " после полседней ноды
            sb.setLength(sb.length() - 2);
            return sb.append("]").toString();
        }


        public Set<K> getKeysList() {
            Set<K> keyList = new LinkedHashSet<>();
            Node<K, V> cursor = this;
            while (cursor != null) {
                keyList.add(cursor.key);
                cursor = cursor.next;
            }
            return keyList;
        }

        public Collection<V> getValuesList() {
            Collection<V> valuesList = new ArrayList<>();
            Node<K, V> cursor = this;
            while (cursor != null) {
                valuesList.add(cursor.value);
                cursor = cursor.next;
            }
            return valuesList;
        }
    }
}