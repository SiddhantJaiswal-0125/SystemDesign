package FactoryPattern;

public class Runner {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryobj = new ShapeFactory();

        Shape shapeobj = shapeFactoryobj.getShape("Rectangle");
        shapeobj.draw();
    }
}
