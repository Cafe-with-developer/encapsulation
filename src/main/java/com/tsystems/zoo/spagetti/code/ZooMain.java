package com.tsystems.zoo.spagetti.code;

public class ZooMain {
    public static void main(String... args) {
        System.out.println("Welcome to our zoo!");
        Cat cat = new Cat();
        cat.personalNumber = 1;
        cat.breed = "Persian cat";
        cat.hairType = "long";
        cat.name = "Murko";
        cat.height = 20;
        cat.weight = 2;

        Dog dog = new Dog();
        dog.personalNumber = 2;
        dog.breed = "Shar Pei";
        dog.hairType = "short";
        dog.name = "Dunco";
        dog.height = 45;
        dog.weight = 23;

        Shark shark = new Shark();
        shark.breed = "White Shark";
        shark.name = "Maznacik";
        shark.personalNumber = 3;
        shark.length = 6;
        shark.weight = 250;

        Whale whale = new Whale();
        whale.breed = "Gray Whale";
        whale.name = "Zlatusik";
        whale.personalNumber = 4;
        whale.length = 12;
        whale.weight = 1500;

        System.out.println("\n");
        cat.whoAmI();
        System.out.printf("My name is: %s%n", cat.name);
        cat.walk();
        cat.run();
        cat.feedMe();

        System.out.println("\n");
        dog.whoAmI();
        System.out.printf("My name is: %s%n", dog.name);
        dog.walk();
        dog.run();
        dog.feedMe();

        System.out.println("\n");
        shark.whoAmI();
        System.out.printf("My name is: %s%n", shark.name);
        shark.swim();
        shark.feedMe();

        System.out.println("\n");
        whale.whoAmI();
        System.out.printf("My name is: %s%n", whale.name);
        whale.swim();
        whale.feedMe();

        System.out.println("\nGood bye and come again!");
    }
}
