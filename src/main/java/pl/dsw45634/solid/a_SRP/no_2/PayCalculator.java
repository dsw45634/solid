package pl.dsw45634.solid.a_SRP.no_2;

/**
 * Odpowiedzialność wyliczania płacy zostaje wydzielona do osobnej klasy, co ułatwia zrozumienie kodu, zapobiega
 * trudnym do wykrycia błędom wynikającym z dokonywania zmian w obrębie wielu odpowiedzialności, ułatwia pracę
 * w zespole, organizację zadań.
 */
class PayCalculator {

    public double calculatePay(Employee employee, int month) {
        EmployeeHoursDAO.Hours hours = EmployeeHoursDAO.EMPLOYEE_HOURS_DAO.getByEmployee(employee, month);
        return hours.hours * hours.rate;
    }
}
