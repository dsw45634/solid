package pl.dsw45634.solid.d_ISP.no_2;

class Timer {

    private Thread timerThread;

    void register(int timeout, TimerClient timerClient) {
        long start = System.currentTimeMillis();
        this.timerThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(timeout);
                } catch (InterruptedException e) {
                    long time = (System.currentTimeMillis() - start) / 1000;
                    timerClient.timeInfo(time);
                    return;
                }
                timerClient.timeout();
                long time = (System.currentTimeMillis() - start) / 1000;
                timerClient.timeInfo(time);
            }
        });
        timerThread.start();
    }

    public void stop() {
        this.timerThread.interrupt();
    }
}
