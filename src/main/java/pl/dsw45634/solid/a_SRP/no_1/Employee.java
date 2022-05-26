package pl.dsw45634.solid.a_SRP.no_1;

/**
 * Klasa Employee ma wiele odpowiedzialności:
 * - metoda calculatePay() odpowiada za obliczanie płacy
 * - metoda reportHours() odpowiada za raportowanie godzin
 * - metoda storePay() odpowiada za zapisanie informacji o płacy do bazy danych - jest to odpowiedzialność której nigdy
 * nie należy łączyć z innymi.
 * - metody calculatePay() i reportHours() korzystają z prywatnej metody regularHours(), gdyby ktoś chciał dokonać zmiany
 * w raportowaniu godzin, aby np. wydobyć informacje o efektywności pracowników mógłby wpłynąć na działanie metody do
 * obliczania płac.
 */
class Employee {

    private final String name;
    private final String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }

    public double calculatePay(int month) {
        return regularHours(month) * DB.EMPLOYEES_HOURS.get(this).get(month).rate;
    }

    public int reportHours(int month) {
        return regularHours(month);
    }

    private int regularHours(int month) {
        return DB.EMPLOYEES_HOURS.get(this).get(month).hours;
    }

    public void storePay() {
        DB.PAYS.add(new DB.Pay(this, calculatePay(0)));
    }
}
