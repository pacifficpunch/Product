package lesson5.zad2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 5 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getShapeName() {
        return "Круг";
    }

    @Override
    public void showInfo() {
        System.out.println("_______________\nХарактеристики фигуры:");
        System.out.println(getShapeName());
        System.out.println("Периметр: " + perimeter());
        System.out.println("Площадь: " + area());
        System.out.println("Цвет фона: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
    }
}
