package pl.dsw45634.solid.b_OCP.no_1.ob;

class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

//    @Override
//    public double circuit() {
//        return 2 * Math.PI * radius;
//    }
}
