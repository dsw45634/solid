package pl.dsw45634.solid.b_OCP.no_2.utils;

import pl.dsw45634.solid.b_OCP.no_2.shape.Diamond;
import pl.dsw45634.solid.b_OCP.no_2.shape.Rectangle;
import pl.dsw45634.solid.b_OCP.no_2.shape.Shape;
//import pl.dsw45634.solid.b_OCP.no_2.shape.Square;

import java.util.ArrayList;
import java.util.List;

/**
 * Aby mieć możliwość dodania nowego kształtu trzeba dokonać paru zmian.
 */
public class ShapeProvider {

    private static final String MESSAGE = "Dodaj kształt: R - romb, P - prostokąt, Z - zakończ";
//    private static final String MESSAGE_CHANGED = "Dodaj kształt: R - romb, P - prostokąt, K - kwadrat, Z - zakończ";

    public static List<Shape> getShapes() {
        List<Shape> shapes = new ArrayList<>();
        String input = "";
        while (!input.equals("Z")) {
            input = InputReader.read(MESSAGE).toUpperCase();
//            input = InputReader.read(MESSAGE_CHANGED).toUpperCase();
            switch (input) {
                case "R":
                    Diamond diamond = createDiamond();
                    shapes.add(diamond);
                    break;
                case "P":
                    Rectangle rectangle = createRectangle();
                    shapes.add(rectangle);
                    break;
//                case "K":
//                    Square square = createSquare();
//                    shapes.add(square);
//                    break;
            }
        }
        return shapes;
    }

//    private static Square createSquare() {
//        Square square = null;
//        while (square == null) {
//            String edge = InputReader.read("Podaj długość boku kwadratu:");
//            try {
//                int e = Integer.parseInt(edge);
//                square = new Square(e);
//            } catch (NumberFormatException ignored) {}
//        }
//        return square;
//    }

    private static Rectangle createRectangle() {
        Rectangle rectangle = null;
        while (rectangle == null) {
            String width = InputReader.read("Podaj długość boku prostokątu:");
            String height = InputReader.read("Podaj długość wysokości prostokątu:");
            try {
                int w = Integer.parseInt(width);
                int h = Integer.parseInt(height);
                rectangle = new Rectangle(w, h);
            } catch (NumberFormatException ignored) {}
        }
        return rectangle;
    }

    private static Diamond createDiamond() {
        Diamond diamond = null;
        while (diamond == null) {
            String edge = InputReader.read("Podaj długość krawędzi rombu:");
            String height = InputReader.read("Podaj długość wysokości rombu:");
            try {
                int e = Integer.parseInt(edge);
                int h = Integer.parseInt(height);
                diamond = new Diamond(e, h);
            } catch (NumberFormatException ignored) {}
        }
        return diamond;
    }
}
