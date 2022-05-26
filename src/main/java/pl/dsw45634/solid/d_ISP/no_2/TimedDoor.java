package pl.dsw45634.solid.d_ISP.no_2;

class TimedDoor extends Door {

    private final static int TIMEOUT = 5000;

    private boolean isOpen;
    private final Timer timer;

    {
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
        timer.register(TIMEOUT, new DoorTimerAdapter(this));
    }

    @Override
    boolean isDoorOpen() {
        return this.isOpen;
    }

    public void alert() {
        System.out.println("Alarm!!!");
    }
}
