package com.tsystems.zoo.encapsulation;

public class Cat {
    private final int personalNumber;
    private final String name;
    private Float height;
    private Float weight;
    private final String breed;
    private final String hairType;

    public Cat(int personalNumber, String name, Float height, Float weight, String breed, String hairType) {
        this.personalNumber = personalNumber;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.breed = breed;
        this.hairType = hairType;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public String getName() {
        return name;
    }

    public Float getHeight() {
        return height;
    }

    public Float getWeight() {
        return weight;
    }

    public String getBreed() {
        return breed;
    }

    public String getHairType() {
        return hairType;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void whoAmI() {
        System.out.println("I am cat");
        System.out.println(this);
    }

    public void feedMe() {
        System.out.println("Cat: Mnam mnam! Thank you I am not hungry anymore");
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
