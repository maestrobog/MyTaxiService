package taxi.controller.car;

import static taxi.lib.InjectorUtils.taxiInstance;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taxi.model.Car;
import taxi.model.Manufacturer;
import taxi.service.CarService;
import taxi.service.ManufacturerService;

public class AddCarController extends HttpServlet {
    private final CarService carService = (CarService) taxiInstance().getInstance(CarService.class);
    private final ManufacturerService manufacturerService = (ManufacturerService) taxiInstance()
            .getInstance(ManufacturerService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/cars/add.jsp").forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        try {
            String model = req.getParameter("model");
            long manufacturerId = Long.parseLong(req.getParameter("manufacturer_id"));
            Manufacturer manufacturer = manufacturerService.get(manufacturerId);
            Car car = new Car(model, manufacturer);
            carService.create(car);
            resp.sendRedirect(req.getContextPath() + "/cars");

        } catch (Exception e) {
            req.setAttribute("errorMsg", "can't find manufacturer id : "
                    + Long.parseLong(req.getParameter("manufacturer_id")));
            req.getRequestDispatcher("/WEB-INF/views/cars/add.jsp").forward(req,resp);

        }
    }
}
