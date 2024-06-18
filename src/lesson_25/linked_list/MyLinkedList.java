package lesson_25.linked_list;

public class MyLinkedList <T>{
    private int size;
    private Node<T> first;
    private Node<T> last;

    //Метод добавления элемента в конец
    public void add(T value){
        if (first == null){
            first =  new Node<T>(value, null, null);
        }else if(last == null){
            last = new Node<>(value, first , null);
            first.next = last;
        }else {
            Node<T> temp = last;
            last = new Node<T>(value, temp, null);
            temp.next = last;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if(first != null){
            sb.append(first.value);
            Node<T> cursor = first.next;
            while (cursor != null){
                sb.append(", ");
                sb.append(cursor.value);
                cursor = cursor.next;
            }
        }



        sb.append("]");
        return sb.toString();
    }

    private static class Node<T>{
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }

    }
}
