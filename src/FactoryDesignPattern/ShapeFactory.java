package FactoryDesignPattern;

//this return the type of shape user want to use
public class ShapeFactory {

    public Shape getshape(String shape){
        switch (shape){
            case "circle":
                return new circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }
}
