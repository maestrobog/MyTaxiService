package taxi.controller.register;

import static taxi.lib.InjectorUtils.taxiInstance;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taxi.model.Driver;
import taxi.service.DriverService;

public class RegisterController extends HttpServlet {
    private final DriverService driverService = (DriverService) taxiInstance()
            .getInstance(DriverService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/register/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        String license = req.getParameter("license");
        String password = req.getParameter("password");
        String login = req.getParameter("login");
        Driver driver = new Driver();
        driver.setPassword(password);
        driver.setLogin(login);
        driver.setName(name);
        driver.setLicenseNumber(license);
        driverService.create(driver);
        resp.sendRedirect("/index");
    }
}
