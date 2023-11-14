package NewDrawingSys;

public class Circle implements Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Circle from center (" + x + ";" + y + "), with radius(" + radius + ")");
    }
}
