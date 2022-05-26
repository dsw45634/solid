package pl.dsw45634.solid.a_SRP.no_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class PayDAO {

    public static final PayDAO PAY_DAO = new PayDAO();

    private PayDAO() {
    }

    public boolean save(Pay pay) {
        return PayDB.PAYS.add(pay);
    }

    public Optional<Pay> findByEmployee(Employee employee) {
        return PayDB.PAYS.stream().filter(pay -> pay.getEmployee().equals(employee)).findAny();
    }

    private static class PayDB {
        private static final List<Pay> PAYS = new ArrayList<>();
    }
}
