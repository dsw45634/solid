package pl.dsw45634.solid.d_ISP.no_2;

class DoorTimerAdapter implements TimerClient {

    private final TimedDoor door;

    public DoorTimerAdapter(TimedDoor door) {
        this.door = door;
    }

    @Override
    public void timeout() {
        door.alert();
    }

    @Override
    public void timeInfo(long time) {
        System.out.printf("Drzwi otwarte: %ss\n", time);
    }
}
