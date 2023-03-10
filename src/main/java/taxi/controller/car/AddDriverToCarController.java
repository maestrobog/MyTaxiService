package taxi.controller.car;

import static taxi.lib.InjectorUtils.taxiInstance;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taxi.model.Car;
import taxi.model.Driver;
import taxi.service.CarService;
import taxi.service.DriverService;

public class AddDriverToCarController extends HttpServlet {
    private final CarService carService = (CarService) taxiInstance().getInstance(CarService.class);
    private final DriverService driverService = (DriverService) taxiInstance()
            .getInstance(DriverService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/cars/drivers/add.jsp").forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        long driverId = Long.parseLong(req.getParameter("driver_id"));
        long carId = Long.parseLong(req.getParameter("car_id"));
        try {
            Driver driver = driverService.get(driverId);
            Car car = carService.get(carId);
            carService.addDriverToCar(driver, car);
            resp.sendRedirect(req.getContextPath() + "/cars/drivers");

        } catch (Exception e) {
            req.setAttribute("errorMsg", "Non correct value = Driver ID: "
                        + Long.parseLong(req.getParameter("driver_id"))
                    + "Car ID: " + Long.parseLong(req.getParameter("car_id")));
            req.getRequestDispatcher("/WEB-INF/views/cars/drivers/add.jsp").forward(req,resp);
        }
    }
}
