package StrategyDesignPattern.afterUsingStrayegypattern;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new normaldrive());
    }
}
