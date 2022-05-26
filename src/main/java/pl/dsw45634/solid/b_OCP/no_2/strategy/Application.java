package pl.dsw45634.solid.b_OCP.no_2.strategy;

/**
 * Wzorzec projektowy strategia rozwiązuje problem odwracania zależności uniwersalnego algorytmu od
 * szczegółowej implementacji. Klasy które implementują interfejs rozwiązują problem w inny sposób
 * i są wymienialne.
 */
interface Application {

    void init();
    void idle();
    void cleanUp();
    boolean isDone();
}
