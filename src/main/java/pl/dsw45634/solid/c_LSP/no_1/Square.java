package pl.dsw45634.solid.c_LSP.no_1;

class Square extends Rectangle {

    public Square(int width) {
        super(width);
    }

    public Square(int width, int height) {
        super(Integer.max(width, height));
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }
}
