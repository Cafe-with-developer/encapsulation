package com.tsystems.zoo.encapsulation;

public class Shark {
    private final int personalNumber;
    private final String name;
    private Float length;
    private Float weight;
    private final String breed;

    public Shark(int personalNumber, String name, Float length, Float weight, String breed) {
        this.personalNumber = personalNumber;
        this.name = name;
        this.length = length;
        this.weight = weight;
        this.breed = breed;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public String getName() {
        return name;
    }

    public Float getLength() {
        return length;
    }

    public Float getWeight() {
        return weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

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
