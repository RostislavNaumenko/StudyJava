package homework_20.runners;

public class Amateur extends Human{

    {
        this.setTypeRunner("Любитель");
    }

    public Amateur(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }

    public Amateur() {
        super(15, 10);
    }
}
