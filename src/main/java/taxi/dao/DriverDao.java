package taxi.dao;

import java.util.Optional;
import taxi.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    public Optional<Driver> findByLogin(String driverName);
}
