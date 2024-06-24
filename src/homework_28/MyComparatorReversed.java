package homework_28;

import java.util.Comparator;

public class MyComparatorReversed implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        int isAEven = a % 2;
        int isBEven = b % 2;

        if (isAEven == 0 && isBEven != 0) {
            // a - четное, b - нечетное => a идет перед b
            return -1;
        } else if (isAEven != 0 && isBEven == 0) {
            // a - нечетное, b - четное => b идет перед a
            return 1;
        }else if (isAEven != 0 && isBEven != 0){
            // оба нечетные => проверка на большое число (по убыванию)
            return b - a;
        } else {
            // оба четные => проверка на большое число
            return a - b;
        }
    }
}
