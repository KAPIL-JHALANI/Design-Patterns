package StrategyDesignPattern.afterUsingStrayegypattern;

public class FastDrive implements Drive{
    @Override
    public void drive() {
        System.out.println("fast drive");
    }
}
