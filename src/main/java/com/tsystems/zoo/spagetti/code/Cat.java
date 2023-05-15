package com.tsystems.zoo.spagetti.code;

public class Cat {
    public int personalNumber;
    public String name;
    public float height;
    public float weight;
    public String breed;
    public String hairType;

    public void whoAmI() {
        System.out.println("I am cat.");
        System.out.println(this);
    }

    public void feedMe() {
        System.out.println("Cat: Mnam mnam! Thank you I am not hungry anymore.");
    }

    public void run() {
        System.out.println("Cat: i am running.");
    }

    public void walk() {
        System.out.println("Cat: i am walking.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "personalNumber=" + personalNumber +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", hairType='" + hairType + '\'' +
                '}';
    }
}
