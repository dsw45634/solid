package pl.dsw45634.solid.a_SRP.no_2;

/**
 * Odpowiedzialność raportowania godzin została wydzielona do osobnej klasy, teraz wszelkie
 * zmiany nie będą wpływać na funkcjonalności znajdujące się w innych modułach.
 */

class HourReporter {

    public void reportHours(Employee employee) {
        EmployeeHoursDAO.Hours hours = EmployeeHoursDAO.EMPLOYEE_HOURS_DAO.getByEmployee(employee, 0);
        System.out.println("hours: " + hours.hours);
        System.out.println("not working hours: " + hours.notWorkingHours);
        System.out.println("rate: " + hours.rate);
        System.out.println("rest: " + hours.rest);
    }
}
