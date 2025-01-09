package FactoryPattern;

public class ShapeFactory {
    Shape getShape(String inp)
    {
        switch (inp){
            case "CIRCLE":
                return  new Circle();
            case "Rectangle":
                return  new Rectangle();
            default:
                return  null;

        }
    }
}
