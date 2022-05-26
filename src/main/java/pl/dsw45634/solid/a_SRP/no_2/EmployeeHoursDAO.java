package pl.dsw45634.solid.a_SRP.no_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeHoursDAO {

    public static final EmployeeHoursDAO EMPLOYEE_HOURS_DAO = new EmployeeHoursDAO();

    private EmployeeHoursDAO() {
    }

    public Hours getByEmployee(Employee employee, int month) {
        return EmployeeHoursDB.EMPLOYEE_HOURS.get(employee).get(month);
    }

    private static class EmployeeHoursDB {
        private final static Map<Employee, List<Hours>> EMPLOYEE_HOURS = new HashMap<>();

        static {
            EmployeeDAO.EMPLOYEE_DAO.getAll()
                    .forEach(employee -> EMPLOYEE_HOURS.put(employee, Arrays.asList(new Hours(200, 40, 200, 200))));
        }
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
}
