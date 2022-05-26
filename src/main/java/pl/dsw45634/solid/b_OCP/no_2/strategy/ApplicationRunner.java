package pl.dsw45634.solid.b_OCP.no_2.strategy;

import java.util.Optional;

/**
 * Klient algorytmu pozostaje bez zmian. Nie wie nic na temat konkretnych strategii.
 */
class ApplicationRunner {

    private final Application application;

    private ApplicationRunner(Application application) {
        this.application = application;
    }

    static Optional<ApplicationRunner> getApplicationRunner() {
        Optional<Application> application = StrategyProvider.getStrategy();
        return application.map(ApplicationRunner::new);
    }

    public void run() {
        application.init();
        while (!application.isDone()) {
            application.idle();
        }
        application.cleanUp();
    }

    public static void main(String[] args) {
        getApplicationRunner().ifPresent(ApplicationRunner::run);
    }
}
