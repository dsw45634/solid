package pl.dsw45634.solid.d_ISP.no_1;

abstract class Door implements TimerClient {

    abstract void lock();
    abstract void unlock();
    abstract boolean isDoorOpen();
}
