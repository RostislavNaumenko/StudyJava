package lesson_27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
    Person person;
    String startEmail = "ros@gmail.com";
    String startPassword = "Qwerty1@";

    @BeforeEach
    void setUp(){
        person = new Person(startEmail, startPassword);
    }

    @Test
    void testValidEmail(){
        String validEmail = "valid@test.com";
        System.out.println("getEmail Before: " + person.getEmail());

        person.setEmail(validEmail);

        Assertions.assertEquals(validEmail, person.getEmail());

        System.out.println("getEmail After: " + person.getEmail());
    }


}
