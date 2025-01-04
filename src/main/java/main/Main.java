package main;

import class_example.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //create person 1
        Person person = new Person("Alexander", "Vasquez");

        System.out.println("\nPerson 1");
        System.out.println(person);
        System.out.println("People counter: " + Person.getCounter());

        //create person 2
        Person person1 = new Person();
        System.out.println("\nEnter the name: ");
        person1.setName(sc.nextLine());
        System.out.println("Enter the last name: ");
        person1.setLastName(sc.nextLine());

        System.out.println("\nPerson 2");
        System.out.println(person1);
        System.out.println("People counter: " + Person.getCounter());
    }
}
