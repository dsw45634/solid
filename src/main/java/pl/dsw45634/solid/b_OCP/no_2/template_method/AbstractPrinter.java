package pl.dsw45634.solid.b_OCP.no_2.template_method;

/**
 * Wzorzec metoda szablonowa rozwiązuje problem odwracania zależności uniwersalnego algorytmu od
 * szczegółowej implementacji. Klasy które rozszerzają klasę abstrakcyjną rozwiązują problem w inny sposób
 * i są wymienialne.
 */
abstract class AbstractPrinter {

    private boolean isDone = false;

    protected boolean isDone() {
        return isDone;
    }

    protected void setDone() {
        isDone = true;
    }

    public void run() {
        init();
        while (!isDone()) {
            idle();
        }
        cleanUp();
    }

    protected abstract void init();
    protected abstract void idle();
    protected abstract void cleanUp();
}
