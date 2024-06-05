public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Red", "Black");
        Shape rectangle = new Rectangle( 5, 10, "Yellow", "Blue");
        Shape triangle = new Triangle(3, 4, 5, "Green", "White");

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);

    }
}