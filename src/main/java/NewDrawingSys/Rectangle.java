package NewDrawingSys;

public class Rectangle implements Shape {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Rectangle with coordinate top-left corner (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }

}
