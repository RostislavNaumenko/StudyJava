package homework_20.runners;

public class Human {
    private final int runSpeed;
    private final int restTime;

    private String typeRunner = "Человек";

    public Human() {
        this.runSpeed = 10;
        this.restTime = 15;
    }

    public Human(int runSpeed, int restTime) {
        this.runSpeed = runSpeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.println(typeRunner + " бежит со скоростью " + runSpeed);
        rest();
    }

    public void rest() {
        System.out.println(typeRunner + " нужно для отдыха " + restTime);
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public int getRestTime() {
        return restTime;
    }

    public String getTypeRunner() {
        return typeRunner;
    }

    public void setTypeRunner(String typeRunner) {
        this.typeRunner = typeRunner;
    }

    // Alt + Insert


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // сравнили ссылки
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Human human = (Human) obj; // кастинг от класса Object к классу Human
        return this.runSpeed == human.runSpeed && this.restTime == human.restTime;
    }


    @Override
    public String toString() {
        return "{" +
                "runSpeed=" + runSpeed +
                ", restTime=" + restTime +
                ", typeRunner='" + typeRunner + '\'' +
                '}';
    }
}
