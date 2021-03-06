package com.example.demo.spring;

public class Employee {
    private Pet pet;
    private Car car;
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Employee(Pet pet, Car car) {
        this.pet = pet;
        this.car = car;
    }

    public void restAtHome() {
        System.out.println("[takes favourite toy to play with little friend]");
        this.pet.say();
        System.out.println("[both are filled with happiness]");
    }

    public void goToWork() {
        System.out.println("[pours food to the pet]");
        this.pet.say();
        System.out.println("[close the door and start the engine]");
        this.car.drive();
    }

    public void wentFromWork() {
        this.car.drive();
        System.out.println("[open the door]");
        this.pet.say();
    }
}
