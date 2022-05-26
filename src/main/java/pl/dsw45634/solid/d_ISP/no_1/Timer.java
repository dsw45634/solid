package pl.dsw45634.solid.d_ISP.no_1;

class Timer {

    private Thread timerThread;

    void register(int timeout, TimerClient timerClient) {
        this.timerThread = new Thread(() -> {
            try {
                Thread.sleep(timeout);
            } catch (InterruptedException e) {
                return;
            }
            timerClient.timeout();
        });
        timerThread.start();
    }

    public void stop() {
        this.timerThread.interrupt();
    }
}
