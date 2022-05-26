package pl.dsw45634.solid.d_ISP.no_3;

import java.util.Scanner;

class ConsoleUI implements UI {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String requestDepositAmount() {
        return read("Podaj kwotę depozytu:");
    }

    @Override
    public void info(String message) {
        System.out.println(message);
    }

    @Override
    public String requestTransferAmount() {
        return read("Podaj kwotę transferu:");
    }

    private String read(String s) {
        String input = "";
        while (input == null || input.equals("")) {
            System.out.println(s);
            input = scanner.nextLine();
        }
        return input;
    }
}
