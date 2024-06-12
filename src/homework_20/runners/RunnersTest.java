package homework_20.runners;

public class RunnersTest {
    public static void main(String[] args) {
        Human human = new Human();

        Human human1 = new Amateur();

        Human human2 = new Profi();


        human.run();

        human1.run();

        human2.run();

    }
}
