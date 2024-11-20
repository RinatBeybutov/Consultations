package LiskovSubstitution;

public class Main {
    public static void main(String[] arg) {
        Rectangle rectangle = new Rectangle(5, 10);
        processRectangle(rectangle);  // Выводит 100

        Square square = new Square(5);
        processRectangle(square);  // Выводит 100, хотя ожидается 25

    }

    public static void processRectangle(Rectangle rectangle) {
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        System.out.println(rectangle.getArea());
    }
}
