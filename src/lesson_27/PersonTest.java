package lesson_27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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

    @ParameterizedTest
    @MethodSource("emailNotValidTest")
    void notValidEmail (String email){

        person.setEmail(email);

        Assertions.assertEquals(startEmail, person.getEmail());
    }

    static Stream<String> emailNotValidTest () {

        return Stream.of(
                        // only 1 @
                "email@@mail.com",
                //dot
                "email@mailcom",
                //after last dot > 2 symbols
                "email@mailco.m",
                //english alphabet, digital, '_', '-', '.', '@'
                "++#email@mail.com",
                // before @ min 1 symbols
                "@mail.com");

    }

    @ParameterizedTest
    @MethodSource("passwordValidTest")
    void testValidPassword (String password){

        person.setPassword(password);

        Assertions.assertEquals(password, person.getPassword());
    }

    static Stream<String> passwordValidTest() {
        return Stream.of("Rostyslav@1", "ROSTy@234", "ROs@tyslav@123!", "rostyslAv$1000");
    }


    @ParameterizedTest
    @MethodSource("passwordNotValidTest")
    void notValidPassword (String password){

        person.setPassword(password);

        Assertions.assertEquals(startPassword, person.getPassword());
    }

    static Stream<String> passwordNotValidTest () {

        return Stream.of(
                // length >= 8
                "Ros@1",
                // min 1 digital
                "Rostyslav@",
                // min 1 lower case
                "ROSTYSLAV@1",
                // min 1 upper case
                "rostyslav@1",
                //min 1 special symbol
                "Rostyslav1");

    }

}
