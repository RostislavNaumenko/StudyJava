package homework_08;

/**
 * Дан массив строк. Вывести на экран все символы самой длинной строки из массива.
 * Пример:
 * { "One", "Two", "Twenty" } ->
 * T
 * w
 * e
 * n
 * t
 * y
 * */
public class Task5 {
    public static void main(String[] args) {

        String[] array = { "One", "Two", "Twenty" };

        int wordLength = array[0].length();
        int index = 1;

        for(int i = 1; i < array.length; i++){
            if(wordLength < array[i].length()){
                wordLength = array[i].length();
                index = i;
            }
        }

        char[] charArray = array[index].toCharArray();

        for (int i = 0; i < charArray.length; i++){
            System.out.println(charArray[i]);
        }
    }
}
