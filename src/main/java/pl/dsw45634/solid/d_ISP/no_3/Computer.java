package pl.dsw45634.solid.d_ISP.no_3;

import pl.dsw45634.solid.b_OCP.no_2.utils.InputReader;

import java.util.Optional;

class Computer {

    Optional<Transaction> chooseTransaction() {
        String input = "";
        while (!input.equals("Q")) {
            input = InputReader.read("Wybierz transakcję:\nD - depozyt\nT - transfer\nQ - wyjdź").toUpperCase();
            switch (input) {
                case "T":
                    return Optional.of(new TransferTransaction(chooseUI()));
                case "D":
                    return Optional.of(new DepositTransaction(chooseUI()));
            }
        }
        return Optional.empty();
    }

    private UI chooseUI() {
        String input = "";
        while (true) {
            input = InputReader.read("Wybierz UI:\nC - konsola\nO - okno").toUpperCase();
            switch (input) {
                case "C":
                    return new ConsoleUI();
                case "O":
                    return new WindowUI();
            }
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Optional<Transaction> transaction = computer.chooseTransaction();
        transaction.ifPresent(Transaction::execute);
    }
}
