package lesson_26.person;


public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("email", "password");

        System.out.println(person);
        System.out.println(person.getPassword());
        person.setPassword("Password@1");
        System.out.println(person.getPassword());

    }
}
