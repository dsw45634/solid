package pl.dsw45634.solid.d_ISP.no_1;

class TimedDoor extends Door {

    private final static int TIMEOUT = 5000;

    private boolean isOpen;
    private final Timer timer;

    public TimedDoor() {
        this.timer = new Timer();
    }

    @Override
    void lock() {
        this.isOpen = false;
        System.out.println("Drzwi z alarmem zamknięte.");
        timer.stop();
    }

    @Override
    void unlock() {
        this.isOpen = true;
        System.out.println("Drzwi z alarmem otwarte.");
        timer.register(TIMEOUT, this);
    }

    @Override
    boolean isDoorOpen() {
        return this.isOpen;
    }

    @Override
    public void timeout() {
        System.out.println("Alarm!!!!");
    }
}
