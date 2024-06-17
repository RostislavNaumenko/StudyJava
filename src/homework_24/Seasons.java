package homework_24;

import homework_23.MagicList;

import java.util.Arrays;

public enum Seasons {
    WINTER(new double[]{-12.3, -20, -15.4}),
    SPRING(new  double[] {3, 8, 18}),
    SUMMER(new double[] {25, 22.3, 28.6}),
    AUTUMN(new double[] {12, 6, 0});
    
    //Можно сделать с помощью обычного массива
    //private final double temperature[];
    
    //Решил сделать с помощью нашего MagicList
    private final MagicList <Double> magicList = new MagicList<>();


    Seasons(double[] temperature){

        //Упаковка массива с температурами в Double 
        Double[] tempArray = Arrays.stream(temperature).boxed().toArray(Double[]::new);

        magicList.addAll(tempArray);
        
    }

    public double getAverageTemperature() {
        double average = 0;

        for (int i = 0; i < magicList.size(); i++) {
            average += magicList.get(i);
        }

        return average/ magicList.size();
    }


    public MagicList<Double> getTemperature() {
        return magicList;
    }
}
