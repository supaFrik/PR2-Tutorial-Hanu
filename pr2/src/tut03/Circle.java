package tut03;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        Circle c2 = new Circle(2.0, "red");
        Circle c3 = new Circle(1.0, "red");

        System.out.printf("%-6s %-10s %-6s%n", "Radius", "Color", "Area");
        System.out.printf("%-6s %-10s %-6s%n", "------", "----------", "------");

        System.out.printf("%-6.2f %-10s %-6.2f%n", c1.getRadius(), c1.getColor(), c1.getArea());
        System.out.printf("%-6.2f %-10s %-6.2f%n", c2.getRadius(), c2.getColor(), c2.getArea());
        System.out.printf("%-6.2f %-10s %-6.2f%n", c3.getRadius(), c3.getColor(), c3.getArea());
    }
}
