package pl.dsw45634.solid.b_OCP.no_2.strategy;

import pl.dsw45634.solid.b_OCP.no_2.utils.InputReader;

import java.util.Optional;

/**
 * Dodanie nowego algorytmu powoduje konieczność niewielkiej modyfikacji klienta.
 */
class StrategyProvider {

    private static final String MESSAGE = "Wybierz: K - konsola, O - okno, Z - zakończ.";
//    private static final String MESSAGE_CHANGED = "Wybierz: K - konsola, O - okno, CS - konsola sortowane, Z - zakończ.";

    public static Optional<Application> getStrategy() {
        String input = "";
        while (!input.equals("Z")) {
            input = InputReader.read(MESSAGE).toUpperCase();
//            input = InputReader.read(MESSAGE_CHANGED).toUpperCase();
            switch (input) {
                case "K":
                    return Optional.of(new ConsoleStrategy());
                case "O":
                    return Optional.of(new WindowStrategy());
//                case "CS":
//                    return Optional.of(new ConsoleOrderedStrategy());
            }
        }
        return Optional.empty();
    }
}
