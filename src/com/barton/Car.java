package com.barton;

public class Car {
    /**
     * Properties, These are default they're changed in the main
     */
    int maxSpeed = 100;//give them values in the console?
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";


    double maxFuel = 16;
    double currentfuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;


    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;

    }

    /**
     * Printing properties
     */
    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println();
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn() {
        numberOfPeopleInCar++;
    }

    public void getOut() {
        numberOfPeopleInCar = numberOfPeopleInCar - 1;
        numberOfPeopleInCar--;
    }

    public double howManyMilesTillNoGas() {
        return currentfuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public static void main(String[] args) {
//Using earlier methods

        /**
         * New instance
         */
        System.out.println("Birthday Car");
        Car birthdayPresent = new Car(500, 5000.534, true);//argument is a piece of data passed into the function
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles Left: " + birthdayPresent.howManyMilesTillNoGas());
        Car christmasPresent = new Car(550, 2000, false);
        christmasPresent.printVariables();
    }
}
