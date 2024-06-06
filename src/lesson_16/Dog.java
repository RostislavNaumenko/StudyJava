package lesson_16;

/*
* Task 2
Написать класс Собака (Dog).

++ Каждая Собака обязательно должна иметь имя и высоту прыжка

++ Должна уметь прыгать и должна уметь тренироваться.

++ За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров

++ Максимальная высота прыжка, которую может натренировать собака, не может быть больше, чем двукратная высота первоначального прыжка.

++ Также должен быть метод взять барьер. В параметрах метод принимает высоту барьера. Если собака в состоянии преодолеть этот барьер - прыгает.
Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
Если да -> идем тренироваться -> берет барьер

++ Добавить в класс константу. Использовать эту константу в классе.

++ Добавить в класс поле, в котором будет храниться количество прыжков, сделанных всеми объектами класса.
* */


public class Dog {
    static final int JUMP_INCREASE = 10;
    static int counter;
    private String name;
    private int jumpHeight;
    private final int maxJump;


    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJump = jumpHeight * 2;
    }

    public void training() {
        jumpHeight += JUMP_INCREASE;

        if(jumpHeight > maxJump){
            jumpHeight = maxJump;
        }
        System.out.println(name + "is training");
    }

    public void jump() {
        System.out.println(name + " jumps");
        counter++;
    }

    public void overcomeTheBarrier(int barrier) {
        System.out.println("Barrier: " + barrier);

        if (jumpHeight >= barrier) {
            System.out.printf("Dog %s get barrier %d. Jump: %d\n", name, barrier, jumpHeight);
            jump();
        }

        if (maxJump < barrier) {
            System.out.println("I cannot jump so height");
        }

        if (maxJump >= barrier) {
            while (jumpHeight < barrier) {
                training();
                System.out.println();
            }
            System.out.printf("Dog %s get barrier %d. Jump: %d\n", name, barrier, jumpHeight);
            jump();
        }

    }

    public String toString() {
        return "{Dog " + name + "; current jump: " + jumpHeight + "}";
    }


    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setName(String name) {
        this.name = name;
    }
}
