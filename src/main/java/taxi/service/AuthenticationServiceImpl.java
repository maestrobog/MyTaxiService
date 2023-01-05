package taxi.service;

import java.util.Optional;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private static DriverService driverService;

    @Override
    public Driver login(String driverLogin, String driverPassword) throws AuthenticationException {
        Optional<Driver> driver = driverService.findByLogin(driverLogin);
        if (driver.isPresent() && driver.get().getPassword().equals(driverPassword)) {
            return driver.get();
        }

        throw new AuthenticationException("Login or password was incorrect");
    }
}
