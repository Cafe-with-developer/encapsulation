package com.tsystems.zoo.spagetti.code;

public class Whale {
    public int personalNumber;
    public String name;
    public float length;
    public float weight;
    public String breed;

    public void whoAmI() {
        System.out.println("I am whale");
        System.out.println(this);
    }

    public void feedMe() {
        System.out.println("Whale: Mnam mnam! Thank you I am not hungry anymore");
    }

    public void swim() {
        System.out.println("Whale: I am swimming.");
    }

    @Override
    public String toString() {
        return "Whale{" +
                "personalNumber=" + personalNumber +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }
}
