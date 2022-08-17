import DecoratorDesignPattern.Base.Margerita;
import DecoratorDesignPattern.Base.Pizza;
import DecoratorDesignPattern.Decorator.Jalpino;
import DecoratorDesignPattern.Decorator.Paneer;
import ObservableDesignPattern.Observable.IphoneObservaleImple;
import ObservableDesignPattern.Observable.StockObservable;
import ObservableDesignPattern.Observer.EmailAlertObserverImple;
import ObservableDesignPattern.Observer.MobileAlertObservaleImple;
import ObservableDesignPattern.Observer.NotificationAlertObserver;

public class Pattern {
    public static void main(String[]args){

//        StockObservable iphone=new IphoneObservaleImple();
//        NotificationAlertObserver observer=new EmailAlertObserverImple("jhalani@gmail.com",iphone);
//        NotificationAlertObserver observer1=new MobileAlertObservaleImple("kapil",iphone);
//        NotificationAlertObserver observer2=new EmailAlertObserverImple("jhalani@gmail.com",iphone);
//
//        iphone.add(observer);
//        iphone.add(observer1);
//        iphone.add(observer2);
//
//        iphone.setStockCount(10);


        //Decorator design pttern

        //base
        Pizza pizza=new Margerita();

        //toppings of panner
        Pizza pannerpizza=new Paneer(pizza);

        int cost=pannerpizza.cost(); //this gives total o base cost + toppings cost

        System.out.println(cost);

        //add one more topping over the panner

        Pizza jalpinoandpanner=new Jalpino(pannerpizza);  // here we add jalpino layer over the panner layer

        int cost1= jalpinoandpanner.cost(); // this gives total of panner+jalpino+base

        System.out.println(cost1);



    }
}
