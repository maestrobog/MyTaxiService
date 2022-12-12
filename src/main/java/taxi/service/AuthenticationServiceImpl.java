package taxi.service;

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
        if (driverService.findByLogin(driverLogin).isEmpty()) {
            throw new AuthenticationException("Login or password was incorrect");
        }

        if (driverService.findByLogin(driverLogin).get().getPassword().equals(driverPassword)) {
            return driverService.findByLogin(driverLogin).get();
        }

        throw new AuthenticationException("Login or password was incorrect");
    }
}
