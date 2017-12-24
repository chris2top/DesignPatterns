public class FactoryPattern {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape s1 = shapeFactory.getShape("CIRCLE");
        s1.draw();

        Shape s2 = shapeFactory.getShape("SQUARE");
        s2.draw();
    }
}
