package StrategyDesignPattern.afterUsingStrayegypattern;

public class Motorcycle extends Vehicle {
    public Motorcycle() {
        super(new FastDrive());
    }
}
