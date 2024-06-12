package homework_20.runners;

public class Human {


    public void run (){
        int runnerSpeed = runnerSpeed();
        int restTime = restTime();
        System.out.printf("RUN! My speed: %d k/h I need %d min of rest \n", runnerSpeed, restTime);
    }

    public int restTime(){

        return 15;
    }

    public int runnerSpeed(){
        return 10;
    }
}
