package pl.dsw45634.solid.b_OCP.no_2.utils;

import javax.swing.*;

public class InputReader {

    public static String read(String message) {
        String input = "";
        while (input == null || input.equals("")) {
            input = JOptionPane.showInputDialog(null, message);
        }
        return input;
    }
}
