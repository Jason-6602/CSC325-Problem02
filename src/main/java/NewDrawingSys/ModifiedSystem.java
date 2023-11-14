package NewDrawingSys;

interface Shape {
    void draw(int x1, int y1, int x2, int y2);
}


public class ModifiedSystem {
        public static void main(String[] args) {
            Shape[] shapes = {new Circle(10, 20, 30), new Rectangle(5, 10, 50, 30)};
            int x1 = 10, y1 = 20;
            int x2 = 30, y2 = 60;

            for (Shape shape : shapes) {
                shape.draw(x1, y1, x2, y2);
            }
        }
    }

