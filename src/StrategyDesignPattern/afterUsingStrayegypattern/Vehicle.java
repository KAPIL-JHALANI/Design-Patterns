package StrategyDesignPattern.afterUsingStrayegypattern;

public class Vehicle {

    Drive d;

    public Vehicle(Drive d) {
        this.d=d;
    }


    public void drivevehicle(){
        d.drive();
    }
}
