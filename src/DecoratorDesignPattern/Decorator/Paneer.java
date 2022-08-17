package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Base.Pizza;

public class Paneer extends Toppings {

    Pizza base;

    public Paneer(Pizza pizza) {
        this.base=pizza;
    }

    @Override
    public int cost() {
        return base.cost()+300;
    }
}
