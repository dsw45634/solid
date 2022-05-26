package pl.dsw45634.solid.b_OCP.no_2.shape;

public class Rectangle implements Shape {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            builder.append("*".repeat(width)).append('\n');
        }
        return builder.toString();
    }

    @Override
    public int area() {
        return width * height;
    }
}
