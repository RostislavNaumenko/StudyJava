package homework_22.triathletes;

public class Triathlete implements Swimmer, Runner{
    private String name;

    public Triathlete(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
}
