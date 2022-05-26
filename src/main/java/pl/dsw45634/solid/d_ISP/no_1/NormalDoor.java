package pl.dsw45634.solid.d_ISP.no_1;

class NormalDoor extends Door {

    private boolean isOpen;

    @Override
    void lock() {
        this.isOpen = false;
        System.out.println("Drzwi normalne zamknięte.");
    }

    @Override
    void unlock() {
        this.isOpen = true;
        System.out.println("Drzwi normalne otwarte.");
    }

    @Override
    boolean isDoorOpen() {
        return this.isOpen;
    }

    @Override
    public void timeout() {}
}
