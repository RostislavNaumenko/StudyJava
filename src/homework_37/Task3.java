package homework_37;

//написать метод, возвращающий первый неповторяющийся символ в строке

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(getFirstUniqueChar(string));
    }


    public static Character getFirstUniqueChar(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Set<Character> set = new HashSet<>();
        Set<Character> firstUniq = new LinkedHashSet<>();

        for(char ch : str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                firstUniq.add(ch);
            }else {
                firstUniq.remove(ch);
            }
        }


        return firstUniq.isEmpty() ? null : firstUniq.iterator().next();
    }

}
