package taxi.controller.manufacturer;

import static taxi.lib.InjectorUtils.taxiInstance;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taxi.model.Manufacturer;
import taxi.service.ManufacturerService;

public class GetAllManufacturersController extends HttpServlet {
    private final ManufacturerService manufacturerService = (ManufacturerService) taxiInstance()
            .getInstance(ManufacturerService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Manufacturer> allManufacturers = manufacturerService.getAll();
        req.setAttribute("manufacturers", allManufacturers);
        req.getRequestDispatcher("/WEB-INF/views/manufacturers/all.jsp").forward(req, resp);
    }
}
