package pl.dsw45634.solid.b_OCP.no_2.template_method;

import pl.dsw45634.solid.b_OCP.no_2.shape.Shape;
import pl.dsw45634.solid.b_OCP.no_2.utils.ShapeProvider;

import javax.swing.*;
import java.util.List;

class WindowPrinter extends AbstractPrinter {

    private List<Shape> shapes;

    @Override
    protected void init() {
        this.shapes = ShapeProvider.getShapes();
    }

    @Override
    protected void idle() {
        for (Shape shape : shapes) {
            JOptionPane.showMessageDialog(null, shape.draw());
        }
        setDone();
    }

    @Override
    protected void cleanUp() {
        JOptionPane.showMessageDialog(null, "Koniec...");
    }
}
