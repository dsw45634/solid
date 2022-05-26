package pl.dsw45634.solid.b_OCP.no_2.shape;

public class Diamond implements Shape {

    private final int edge;
    private final int height;

    public Diamond(int edge, int height) {
        this.edge = edge;
        this.height = height;
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            builder.append(" ".repeat(i));
            builder.append("*".repeat(edge)).append('\n');
        }
        return builder.toString();
    }

    @Override
    public int area() {
        return height * edge;
    }
}
