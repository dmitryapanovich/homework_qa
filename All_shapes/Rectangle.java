public class Rectangle implements Shape {
    private double side1;
    private double side2;
    private String colorFon;
    private String colorBorder;

    public Rectangle(double side1, double side2, String colorFon, String colorBorder) {
        this.side1 = side1;
        this.side2 = side2;
        this.colorFon = colorFon;
        this.colorBorder = colorBorder;
    }
    public double perimeterСalculation() {
        return (side1 + side2) * 2;
    }

    public double areaCalculation() {
        return side1 * side2;
    }
    public String toString() {
        return "Tectangle: " + "Perimeter = " + perimeterСalculation() + ", " +
                "Area = " + areaCalculation() + ", " +
                "Color Font = " + colorFon + ", " +
                "Color Border = " + colorBorder;
    }
}
