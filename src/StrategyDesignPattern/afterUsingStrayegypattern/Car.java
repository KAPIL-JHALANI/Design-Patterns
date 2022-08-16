package StrategyDesignPattern.afterUsingStrayegypattern;

public class Car extends Vehicle {

    public Car() {
        super(new FastDrive());
    }
}
