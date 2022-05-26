package pl.dsw45634.solid.c_LSP.no_1;

class Rectangle {

    protected int width;
    protected int height;

    public Rectangle(int width) {
        this.width = width;
        this.height = width;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return width * height;
    }
}
