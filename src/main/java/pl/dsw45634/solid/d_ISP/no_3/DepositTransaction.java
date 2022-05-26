package pl.dsw45634.solid.d_ISP.no_3;

class DepositTransaction extends Transaction {

    private final DepositUI ui;

    public DepositTransaction(DepositUI ui) {
        this.ui = ui;
    }

    @Override
    void execute() {
        String amount = ui.requestDepositAmount();
        String message = "Wykonuję depozyt: " + amount;
        ui.info(message);
    }
}
