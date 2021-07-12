package basics;

public class Rectangle implements Shape {
    @Override public void array() {
        System.out.println("In rectangle");
    }

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape s = factory.getRequiredShape("Triangle");
        System.out.println(s.hashCode());
        Shape s1 = factory.getRequiredShape("Triangle");
        System.out.println(s1.hashCode());
    }
}
