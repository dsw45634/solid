package pl.dsw45634.solid.b_OCP.no_2.strategy;

import pl.dsw45634.solid.b_OCP.no_2.shape.Shape;
import pl.dsw45634.solid.b_OCP.no_2.utils.ShapeProvider;

import java.util.List;
import java.util.stream.Collectors;

//public class ConsoleOrderedStrategy implements Application {
//
//    private boolean done;
//    private List<Shape> shapes;
//
//    @Override
//    public void init() {
//        this.shapes = ShapeProvider.getShapes().stream()
//                .sorted(((o1, o2) -> (int) (o1.area() - o2.area())))
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public void idle() {
//        for (Shape shape : shapes) {
//            System.out.println(shape.draw());
//        }
//        this.done = true;
//    }
//
//    @Override
//    public void cleanUp() {
//        System.out.println("Koniec.");
//    }
//
//    @Override
//    public boolean isDone() {
//        return this.done;
//    }
//}
