package homework_38;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * №1
 * Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
 * где каждому слову соответствует количество его вхождений в текст.
 * */
public class Task1 {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";


        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));


        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
        System.out.println();

        Map<Character, Integer> frequencyLettersMap = frequencyLettersDictionary(text);
        System.out.println("\nВхождение только букв: ");
        frequencyLettersMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
        System.out.println();


    }

    public static String[] stringOnlyWords(String str) {
        String stringOnlyWords = str.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");

        return stringOnlyWords.split(" ");
    }

    public static Map<String, Integer> frequencyDictionary(String str) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (String word : stringOnlyWords(str)) {
            if (stringIntegerMap.containsKey(word)) {
                stringIntegerMap.put(word, stringIntegerMap.get(word) + 1);
            } else {
                stringIntegerMap.put(word, 1);

            }
        }

        return stringIntegerMap;
    }

    public static Map<Character, Integer> frequencyCharsDictionary(String str) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (characterIntegerMap.containsKey(ch)) {
                characterIntegerMap.put(ch, characterIntegerMap.get(ch) + 1);
            } else {
                characterIntegerMap.put(ch, 1);
            }
        }

        return characterIntegerMap;
    }

    public static Map<Character, Integer> frequencyLettersDictionary(String str) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (String word : stringOnlyWords(str)) {
            for (char ch : word.toCharArray()) {
                if (characterIntegerMap.containsKey(ch)) {
                    characterIntegerMap.put(ch, characterIntegerMap.get(ch) + 1);
                } else {
                    characterIntegerMap.put(ch, 1);
                }
            }
        }
        return characterIntegerMap;
    }

}
