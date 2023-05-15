package com.tsystems.zoo.spagetti.code;

public class Dog {
    public int personalNumber;
    public String name;
    public float height;
    public float weight;
    public String breed;
    public String hairType;

    public void whoAmI() {
        System.out.println("I am dog");
        System.out.println(this);
    }

    public void feedMe() {
        System.out.println("Dog: Mnam mnam! Thank you I am not hungry anymore");
    }

    public void run() {
        System.out.println("Dog: i am running.");
    }

    public void walk() {
        System.out.println("Dog: i am walking.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "personalNumber=" + personalNumber +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", hairType='" + hairType + '\'' +
                '}';
    }
}
