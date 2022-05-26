package pl.dsw45634.solid.b_OCP.no_1.ds;

/**
 * Kod strukturalny:
 * - ułatwia dodawanie nowych metod,
 * - utrudnia dodawanie nowych struktur danych.
 */

class Calc {

    double area(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getHeight() * rectangle.getWidth();
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
//        } else if (shape instanceof Triangle) {
//            Triangle triangle = (Triangle) shape;
//            return (triangle.getEdge() * triangle.getHeight()) / 2 ;
        } else {
            throw new IllegalArgumentException("Nie ma takiego kształtu.");
        }
    }

    /**
     * Jeśli trzeba dodać nową metodę zmiana jest konieczna w jednym miejscu.
     */

//    double circuit(Object shape) {
//        if (shape instanceof Rectangle) {
//            Rectangle rectangle = (Rectangle) shape;
//            return 2 * (rectangle.getHeight() + rectangle.getWidth());
//        } else if (shape instanceof Circle) {
//            Circle circle = (Circle) shape;
//            return 2 * Math.PI * circle.radius;
//        } else {
//            throw new IllegalArgumentException("Nie ma takiego kształtu.");
//        }
//    }
}
