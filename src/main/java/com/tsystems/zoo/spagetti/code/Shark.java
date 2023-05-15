package com.tsystems.zoo.spagetti.code;

public class Shark {
    public int personalNumber;
    public String name;
    public float length;
    public float weight;
    public String breed;

    public void whoAmI() {
        System.out.println("I am shark");
        System.out.println(this);
    }

    public void feedMe() {
        System.out.println("Shark: Mnam mnam! Thank you I am not hungry anymore");
    }

    public void swim() {
        System.out.println("Shark: I am swimming.");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "personalNumber=" + personalNumber +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }
}
