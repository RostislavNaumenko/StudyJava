package homework_07;

import java.util.Random;

/**
 * Используйте оператор switch для решения задачи:
 * Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система.
 * Запишите в переменную случайное число от 0 до 12.

 * Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.
 * Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
 * Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
 * Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
 * Оценка 3 балла: огорчитесь и вычтите 30 минут.
 * Оценка меньше 3 баллов: запретите телевизор на сегодня.
 * Выведите на экран оставшееся время для просмотра ТВ.
 * */



public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();

        int achieve = random.nextInt(12) + 1;
        System.out.print("Оценка: " + achieve + "\n");

        int timeForWatchTV = 45;

        int achieve3 = -30;
        int achieve4To6 = 15;
        int achieve7To9 = 45;
        int achieve10To12 = 60;



        switch (achieve) {
            case 1:
            case 2:
                timeForWatchTV = 0;
                System.out.print("Время для просмотра телевизора: " + timeForWatchTV);
                break;
            case 3:
                timeForWatchTV += achieve3;
                System.out.print("Время для просмотра телевизора: " + timeForWatchTV);
                break;
            case 4:
            case 5:
            case 6:
                timeForWatchTV += achieve4To6;
                System.out.print("Время для просмотра телевизора: " + timeForWatchTV);
                break;
            case 7:
            case 8:
            case 9:
                timeForWatchTV += achieve7To9;
                System.out.print("Время для просмотра телевизора: " + timeForWatchTV);
                break;
            case 10:
            case 11:
            case 12:
                timeForWatchTV += achieve10To12;
                System.out.print("Время для просмотра телевизора: " + timeForWatchTV);
                break;
            default:
                break;
        }
    }
}
