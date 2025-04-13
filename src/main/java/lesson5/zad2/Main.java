package lesson5.zad2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12, "Чёрный", "Белый");
        circle.showInfo();

        Rectangle rectangle = new Rectangle(9, 9, "Синий", "Синий");
        rectangle.showInfo();

        Triangle triangle = new Triangle(6, 3, 3, "Голубой", "Фиолетовый");
        triangle.showInfo();
    }
}
