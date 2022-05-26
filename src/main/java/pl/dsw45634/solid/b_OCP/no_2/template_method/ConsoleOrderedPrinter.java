package pl.dsw45634.solid.b_OCP.no_2.template_method;

import pl.dsw45634.solid.b_OCP.no_2.shape.Shape;
import pl.dsw45634.solid.b_OCP.no_2.utils.ShapeProvider;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//class ConsoleOrderedPrinter extends AbstractPrinter {
//
//    private List<Shape> shapes;
//
//    @Override
//    protected void init() {
//        this.shapes = ShapeProvider.getShapes().stream()
//                .sorted(Comparator.comparingInt(Shape::area))
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    protected void idle() {
//        for (Shape shape : shapes) {
//            System.out.println(shape.draw());
//        }
//        setDone();
//    }
//
//    @Override
//    protected void cleanUp() {
//        System.out.println("Koniec...");
//    }
//}
