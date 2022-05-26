package pl.dsw45634.solid.b_OCP.no_1.ds;

/**
 * Klasa prostokąt też jest strukturą danych:
 * - pola są prywatne, ale dostęp do nich nie jest ukryty
 * - dostęp do pól jest możliwy poprzez publiczne metody get, set
 */

class Rectangle {

    private int width;
    private int height;

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
}
