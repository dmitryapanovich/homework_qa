public class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;
    private String colorFon;
    private String colorBorder;

    public Triangle(double side1, double side2, double side3, String colorFon, String colorBorder) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.colorFon = colorFon;
        this.colorBorder = colorBorder;
    }
    public double perimeterСalculation() {
        return side1 + side2 + side3;
    }

    public double areaCalculation() {
        double halfperimeter = perimeterСalculation() / 2;
        return Math.sqrt(halfperimeter * (halfperimeter - side1) * (halfperimeter - side2) * (halfperimeter - side3));
    }
    public String toString() {
        return "Triangle: " + "Perimeter = " + perimeterСalculation() + ", " +
                "Area = " + areaCalculation() + ", " +
                "Color Font = " + colorFon + ", " +
                "Color Border = " + colorBorder;
    }
}
