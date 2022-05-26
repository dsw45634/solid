package pl.dsw45634.solid.a_SRP.no_2;

class Pay {

    private Employee employee;
    private double pay;

    public Pay(Employee employee, double pay) {
        this.employee = employee;
        this.pay = pay;
    }

    public Employee getEmployee() {
        return employee;
    }

    public double getPay() {
        return pay;
    }

    @Override
    public String toString() {
        return employee + ": pay -> " + pay;
    }
}
