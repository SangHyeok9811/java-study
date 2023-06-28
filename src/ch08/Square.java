package ch08;

public class Square implements Shape, Drawable{
    private double side; // 변의 값

    public Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public void drawLines() {

    }
}
