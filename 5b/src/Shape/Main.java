package Shape;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(8, 20);
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Shape circle = new Circle(3);
        System.out.println("Circle area: " + circle.calculateArea());
    }
}
