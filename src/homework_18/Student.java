package homework_18;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student extends Human{
    private int className;
    private int homework;


    public Student(int years, String name, String lastName, int className, int homework) {
        super(years, name, lastName);
        this.className = className;
        this.homework = homework;
    }

    public void addHomework(){
        Calendar calendar = Calendar.getInstance();

        Calendar dateToday = new GregorianCalendar();

        if(dateToday.get(Calendar.MONTH) == Calendar.JULY || dateToday.get(Calendar.MONTH) == Calendar.AUGUST){
            System.out.println("Каникулы, нет домашнего задания!");
            homework = 0;
        }

        homework++;
        System.out.println("Добавлена домашняя работа, всего нужно выполнить домашнего задания: " + homework);
    }

    public void  homeworkDone() {
        if (homework < 0) homework = 0;

        if (homework == 0) System.out.println("Все домашнее задание выполнено!");

        homework--;
        System.out.println("Домашнее задание выполнено. Осталось выполнить: " + homework);
    }



    public int setClass(int className) {

        // Проверка, если 1 сентября, то класс + 1;
        // Незнаю где ее вызвать для обновления

//        Calendar calendar = Calendar.getInstance();
//
//        Calendar dateToday = new GregorianCalendar();
//
//        Calendar firstSeptember = new GregorianCalendar(calendar.get(Calendar.YEAR), Calendar.SEPTEMBER, 1);
//
//        if ((firstSeptember.get(Calendar.DAY_OF_MONTH)) == (dateToday.get(Calendar.DAY_OF_MONTH))) className++;

        return  this.className = className;

    }

    public int getClassName() {
        return className;

    }

    public int getHomework() {
        return homework;
    }
}
