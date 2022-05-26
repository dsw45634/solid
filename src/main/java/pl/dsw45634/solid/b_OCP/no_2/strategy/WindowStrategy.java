package pl.dsw45634.solid.b_OCP.no_2.strategy;

import pl.dsw45634.solid.b_OCP.no_2.shape.Shape;
import pl.dsw45634.solid.b_OCP.no_2.utils.ShapeProvider;

import javax.swing.*;
import java.util.List;

class WindowStrategy implements Application {

    private boolean done = false;
    private List<Shape> shapes;

    @Override
    public void init() {
        this.shapes = ShapeProvider.getShapes();
    }

    @Override
    public void idle() {
        for(Shape shape : shapes) {
            JOptionPane.showMessageDialog(null, shape.draw());
        }
        this.done = true;
    }

    @Override
    public void cleanUp() {
        JOptionPane.showMessageDialog(null, "Koniec");
    }

    @Override
    public boolean isDone() {
        return this.done;
    }
}
