public class ShapeFactory extends AbstractFactory{
    public Color getColor(String colorType) {
        return null;
    }

    public Shape getShape(String shapeType) {
        if(shapeType == null || shapeType.equals("")){
            return null;
        }
        else if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }else {
            return null;
        }
    }
}
