package main;

import class_example.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person("Alexander", "Vasquez");

        Person person1 = new Person();
        System.out.println("Enter the name: ");
        person1.setName(sc.nextLine());
        System.out.println("Enter the last name: ");
        person1.setLastName(sc.nextLine());

        System.out.println("Person 1");
        System.out.println("Name: " + person.getName());
        System.out.println("Last Name: " + person.getLastName());

        System.out.println("Person 2");
        System.out.println("Name: " + person1.getName());
        System.out.println("Last Name: " + person1.getLastName());
    }
}
