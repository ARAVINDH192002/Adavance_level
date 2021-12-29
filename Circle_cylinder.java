import java.util.Scanner;
class Circle {
    private double radius = 1.0;
    private String colour = "red";

    Circle() {
    }

    Circle(double r) {
        this.radius = r;
    }

    Circle(double r, String s) {
        this.colour = s;
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: radius=" + radius + " color=" + colour;
    }

}

class Cylinder extends Circle {
    private double height = 1.0;
    private double radius = 1.0;

    Cylinder() {
    }

    Cylinder(double r) {
        super(r);
    }

    Cylinder(double r, double h) {
        super(r);
        this.height = h;
    }

    Cylinder(double r, double h, String s) {
        super(r, s);
        this.height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double r = radius;
        return (2 * (r + height) * Math.PI);
    }

    public double getVolume() {
        double r = radius;
        double volume = ((Math.PI) * ((r * r) * height));
        return volume;
    }

    @Override
    public String toString() {
        return "Cylinder: radius=" + radius + " " + "color=" + getColour() + " " + "height=" + height;
    }

}

class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        Circle x = new Circle(r);
        Cylinder y = new Cylinder(r, h);
        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.printf("%.2f\n", x.getArea());
        System.out.printf("%.2f\n", y.getArea());
        System.out.printf("%.2f", y.getVolume());
    }
}

 
