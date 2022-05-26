package pl.dsw45634.solid.a_SRP.no_1;

class Main {
    public static void main(String[] args) {
        DB.EMPLOYEES.forEach(Employee::storePay);
        DB.PAYS.forEach(System.out::println);
    }
}
