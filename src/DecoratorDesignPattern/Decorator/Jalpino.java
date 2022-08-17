package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Base.Pizza;

public class Jalpino extends Toppings{

    Pizza base;


    public Jalpino(Pizza p){
        this.base=p;
    }

    @Override
    public int cost() {
        return base.cost()+100;
    }
}
