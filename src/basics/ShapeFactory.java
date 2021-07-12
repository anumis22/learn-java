package basics;

public class ShapeFactory {

    static Rectangle rectangle = new Rectangle();
    static Circle circle = new Circle();
    static Triangle triangle = new Triangle();

    public Shape getRequiredShape(String type) {
        switch (type) {
            case "Triangle" :
                return triangle;
            case "Circle" :
                return circle;
            case "Rectangle" :
                return rectangle;
            default: throw new RuntimeException("Invalid type");
        }
    }
}
