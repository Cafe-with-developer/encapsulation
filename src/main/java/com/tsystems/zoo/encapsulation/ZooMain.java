package com.tsystems.zoo.encapsulation;

public class ZooMain {
    public static void main(String... args) {
        System.out.println("Welcome to our zoo!");
        Cat cat = new Cat(1, "Murko", 20F, 2F, "Persian Cat", "Long");

        Dog dog = new Dog(2, "Dunco", 45F, 23F, "Shar Pei", "short");

        Shark shark = new Shark(3, "Maznacik", 6F, 250F, "White Shark");

        Whale whale = new Whale(4, "Zlatusik", 12F, 1500F, "Grey Whale");

        System.out.println("\n");
        cat.whoAmI();
        System.out.printf("My name is: %s%n", cat.getName());
        cat.walk();
        cat.run();
        cat.feedMe();

        System.out.println("\n");
        dog.whoAmI();
        System.out.printf("My name is: %s%n", dog.getName());
        dog.walk();
        dog.run();
        dog.feedMe();

        System.out.println("\n");
        shark.whoAmI();
        System.out.printf("My name is: %s%n", shark.getName());
        shark.swim();
        shark.feedMe();

        System.out.println("\n");
        whale.whoAmI();
        System.out.printf("My name is: %s%n", whale.getName());
        whale.swim();
        whale.feedMe();

        System.out.println("Good bye and come again!");

        // if you want to change the value of field of the existing object just use the setters f.e
        cat.setHeight(69f);
        cat.setWeight(6.9f);

        // in case you need to read particular field of object just use getter f.e.
        String name = cat.getName();
        String breed = cat.getBreed();
    }
}
