package pl.dsw45634.solid.b_OCP.no_1.ob;

/**
 * Obiekty w przeciwieństwie do struktur danych:
 * - ukrywają swoje atrybuty,
 * - udostępniają publiczne metody do operowania na nich.
 */
class Rectangle implements Shape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

//    @Override
//    public double circuit() {
//        return 2 * (width + height);
//    }
}
