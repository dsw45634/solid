package pl.dsw45634.solid.d_ISP.no_3;

import pl.dsw45634.solid.b_OCP.no_2.utils.InputReader;

import javax.swing.*;

class WindowUI implements UI {

    @Override
    public String requestDepositAmount() {
        return InputReader.read("Podaj kwotę depozytu:");
    }

    @Override
    public void info(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public String requestTransferAmount() {
        return InputReader.read("Podaj kwotę transferu:");
    }
}
