package pl.dsw45634.solid.b_OCP.no_2.template_method;

import pl.dsw45634.solid.b_OCP.no_2.utils.InputReader;

import java.util.Optional;

class Client {

    private static final String MESSAGE = "Wybierz: K - konsola, O - okno, Z - zakończ.";
//    private static final String MESSAGE_CHANGED = "Wybierz: K - konsola, O - okno, KS - konsola sortowane,  Z - zakończ.";

    private static Optional<AbstractPrinter> getPrinter() {
        String input = "";
        while (!input.equals("Z")) {
            input = InputReader.read(MESSAGE).toUpperCase();
//            input = InputReader.read(MESSAGE_CHANGED).toUpperCase();
            switch (input) {
                case "K":
                    return Optional.of(new ConsolePrinter());
                case "O":
                    return Optional.of(new WindowPrinter());
//                case "KS":
//                    return Optional.of(new ConsoleOrderedPrinter());
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        getPrinter().ifPresent(AbstractPrinter::run);
    }
}
