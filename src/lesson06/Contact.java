package lesson06;

import java.time.LocalDate;

public class Contact {

    String firstName = null;
    String lastName;
    String email;
    Integer phoneNumber;
    Integer age;

    void reject() {

    }

    void invite() {
        if (age > 18) {
            System.out.println("Dear " + firstName + "! We are happy to invite on interview");
        } else {
            System.out.println("Sorry please contact to us when you become at 18!");
        }

    }
    public static void main(String[] args) {
        Contact contact1 = new Contact();
        contact1.firstName = "Alex";
        contact1.age = 14;
        System.out.println(contact1);
        Contact contact2 = new Contact();
        contact2.firstName = "Joe";
        contact2.age = 22;
        System.out.println(contact2);
        Contact contact3 = new Contact();
        contact3.firstName = "John";
        contact3.age = 32;
        System.out.println(contact3);
        contact1.invite();
        contact2.invite();
        contact3.invite();
    }
}
