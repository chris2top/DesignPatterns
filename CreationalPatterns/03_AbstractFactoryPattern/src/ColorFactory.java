public class ColorFactory extends AbstractFactory {
    public Shape getShape(String shapeType) {
        return null;
    }

    public Color getColor(String colorType) {
        if(colorType == null || colorType.equals("")){
            return null;
        }
        else if(colorType.equalsIgnoreCase("RED")) {
            return new Red();
        }else if(colorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        }else {
            return null;
        }
    }
}
