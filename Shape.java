package Inheritance;
import java.util.Scanner;

class Shape {
    double area;

    public void computeArea() {
        area = 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double a) {
        this.radius = a;
    }

    @Override
    public void computeArea() {
        this.area = (3.14) * ((this.radius * this.radius));
    }
}

class Rectangle extends Shape {
    double len;
    double br;

    Rectangle(double l, double b) {
        this.len = l;
        this.br = b;
    }

    @Override
    public void computeArea() {
        this.area = (this.len * this.br);
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    @Override
    public void computeArea() {
        this.area = (this.base * this.height) * 0.5;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            double r = sc.nextDouble();
            Circle x = new Circle(r);
            x.computeArea();
            System.out.printf("%.2f", x.area);
        } else if (n == 2) {
            double r = sc.nextDouble();
            double s = sc.nextDouble();
            Rectangle x = new Rectangle(r, s);
            x.computeArea();
            System.out.printf("%.2f", x.area);
        } else if (n == 3) {
            double r = sc.nextDouble();
            double s = sc.nextDouble();
            Triangle x = new Triangle(r, s);
            x.computeArea();
            System.out.printf("%.2f", x.area);
        } else {
            System.out.println("Invalid Input");
        }
    }
}