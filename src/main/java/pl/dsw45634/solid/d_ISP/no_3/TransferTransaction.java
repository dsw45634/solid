package pl.dsw45634.solid.d_ISP.no_3;

class TransferTransaction extends Transaction {

    private final TransferUI ui;

    public TransferTransaction(TransferUI ui) {
        this.ui = ui;
    }

    @Override
    void execute() {
        String amount = ui.requestTransferAmount();
        String message = "Wykonuję transfer: " + amount;
        ui.info(message);
    }
}
