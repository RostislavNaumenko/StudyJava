package lesson_15;

/*
* В резиновом массиве должны быть реализованы методы:

1.Добавлять в массив элемент ++

2.Динамическое изменение состояния массива (размера) ++

3.Возвращать строковое представление массива ++

4.Добавлять в массив сразу несколько значений ++

5.Текущее количество элементов в массиве ++

6.Возвращает значение по индексу ++

7.Удаление элемента по индексу (Есть индекс - удалить этот элемент из массива). Вернуть старое значение ++

8.Конструктор, который принимает массив и создает MagiArray с такими же значениями ++

9.Удаление элемента по значению remove ByValue() ++

10.Поиск элемента по значению - вернуть индекс indexOf() ++

11.Замена значения по индексу (есть индекс и новое значение) ++

12.Вернуть наш магический массив в виде обычного массива -> int[] toArray() ++
* */

public class MagicArray {
    private int[] array;
    private int cursor;

    public MagicArray() {

        array = new int[10];
    }

    //Task 8
    //Конструктор, который принимает массив и создает MagiArray с такими же значениями
    public MagicArray(int[] array) {


        cursor = array.length;
        this.array = new int[cursor * 2];

        for (int i = 0; i < cursor; i++) {
            this.array[i] = array[i];
        }
    }

    //Task 1
    // Добавляем 1 элемент
    public void add(int value) {

        if (cursor == array.length - 1) {
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    //Task 2
    // Динамическое расширение размера массива
    public void expandArray() {
        int[] result = new int[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }

        array = result;

    }

    //Task 3
    //Возвращать строковое представление массива
    public String toString() {
        if (cursor == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < cursor; i++) {
            sb.append(array[i]).append((i < cursor - 1) ? ", " : "]");
        }

        return sb.toString();
    }

    //Task 4
    //Добавляем в массив несколько элемнтов
    public void add(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }

    }


    //Task 5
    //Текущее количество элементов в массиве
    public int size() {
        return cursor;
    }

    //Task 6
    //Возвращает значение по индексу
    public int getValue(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        } else {
            return Integer.MIN_VALUE;
            //TODO Поправить обработку не коректного индекса
        }
    }

    //Task 7
    //Удаление элемента по индексу (Есть индекс - удалить этот элемент из массива). Вернуть старое значение
    public int removeByIndex(int index) {
        if (index < 0 || index >= cursor) {
            return Integer.MIN_VALUE;
        }
        int value = array[index];

        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }
        cursor--;
        return value;
    }

    //Task 9
    //Удаление элемента по значению removeByValue()
    public int removeByValue(int value) {


        int index = findIndexByValue(value);
        if (index != -1) removeByIndex(index);

        return index;
    }

    //Task 10;
    //Поиск элемента по значению
    public int findIndexByValue(int value) {
        int index = -1;

        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                index = i;
            }
        }
        return index;
    }



    //Task 11
    //Замена значения по индексу
    public int changeValueByIndex(int value, int index) {
        int indexOf = getValue(index);

        if (indexOf != Integer.MIN_VALUE) {
            array[index] = value;
        }

        return indexOf;

    }

    //Task 12
    //Вернуть наш магический массив в виде обычного массива
    public int[] getArray() {

        int[] arr = new int[cursor];
        for (int i = 0; i < cursor; i++) {
            arr[i] = array[i];
        }

        return arr;
    }

    public int lengthByHande () {
        int maxIndex = 0;
        try {
            for (int i = 0; ;i++) {
                if(array[i] != 0){

                }
                array[i] += 0;
                maxIndex = i;
            }
        }catch (Exception e){
            System.out.println("Something went wrong.");
        }

        return maxIndex;
    }

}
