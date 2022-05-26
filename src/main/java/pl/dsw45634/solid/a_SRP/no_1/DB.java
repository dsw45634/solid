package pl.dsw45634.solid.a_SRP.no_1;

import java.util.*;

/**
 * Dla uproszczenia przykładu bazę danych zastąpią mapy i listy.
 */
class DB {

    public static final Map<Employee, List<Hours>> EMPLOYEES_HOURS = new HashMap<>();
    public static final List<Employee> EMPLOYEES = new ArrayList<>();
    public static final List<Pay> PAYS = new ArrayList<>();

    static {
        EMPLOYEES.add(new Employee("Ela", "Dzik"));
        EMPLOYEES.add(new Employee("John", "Brown"));
        EMPLOYEES.add(new Employee("Ellen", "Smith"));
        EMPLOYEES.forEach(employee -> EMPLOYEES_HOURS.put(employee, Arrays.asList(new Hours(200, 40, 100, 100))));
    }

    static class Hours {
        // year, month...
        int hours;
        int rest;
        int notWorkingHours;
        double rate;

        public Hours(int hours, int rest, int notWorkingHours, double rate) {
            this.hours = hours;
            this.rest = rest;
            this.notWorkingHours = notWorkingHours;
            this.rate = rate;
        }
    }

    static class Pay {
        // year, month...
        Employee employee;
        double pay;

        public Pay(Employee employee, double pay) {
            this.employee = employee;
            this.pay = pay;
        }

        @Override
        public String toString() {
            return String.format("Pay:\nEmployee: %s\npay: %s", this.employee, this.pay);
        }
    }
}
