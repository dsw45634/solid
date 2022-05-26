package pl.dsw45634.solid.a_SRP.no_2;

import java.util.ArrayList;
import java.util.List;

/**
 * EmployeeDAO - klasa odpowiedzialna za komunikację z bazą danych. Tutaj znajdą się wszystkie
 * metody jakie są potrzebne do utrwalania, wydobywania danych.
 * Prywatny konstruktor sprawia, że z poza klasy nie można utworzyć obiektu EmployeeDAO, jedyny obiekt tej klasy
 * jest tworzony w czasie kompilacji, lub podczas pierwszego odwołania się do klasy, referencja do niego zostaje
 * zapisana w stałej statycznej EMPLOYEE_DAO.
 * W tym przykładzie dla uproszczenia bazę imituje lista.
 */

class EmployeeDAO {

    public static final EmployeeDAO EMPLOYEE_DAO = new EmployeeDAO();

    private EmployeeDAO() {
    }

    public boolean save(Employee employee) {
        return EmployeeDB.EMPLOYEES.add(employee);
    }

    public boolean delete(Employee employee) {
        return EmployeeDB.EMPLOYEES.remove(employee);
    }

    public List<Employee> getAll() {
        return EmployeeDB.EMPLOYEES;
    }

    private static class EmployeeDB {

        public static final List<Employee> EMPLOYEES = new ArrayList<>();

        static {
            EMPLOYEES.add(new Employee("Ela", "Dzik"));
            EMPLOYEES.add(new Employee("John", "Brown"));
            EMPLOYEES.add(new Employee("Ellen", "Smith"));
        }
    }
}
