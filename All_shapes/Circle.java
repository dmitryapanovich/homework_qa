public class Circle implements Shape {
    private double radius;
    private String colorFon;
    private String colorBorder;

    public Circle(double radius, String colorFon, String colorBorder) {
        this.radius = radius;
        this.colorFon = colorFon;
        this.colorBorder = colorBorder;
    }
    public double perimeterСalculation() {
        return 2 * Math.PI * radius;
    }

    public double areaCalculation() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return "Circle: " + "Perimeter = " + perimeterСalculation() + ", " +
                "Area = " + areaCalculation() + ", " +
                "Color Font = " + colorFon + ", " +
                "Color Border = " + colorBorder;
        
    }
}
