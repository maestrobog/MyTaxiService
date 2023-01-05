package taxi.controller.manufacturer;

import static taxi.lib.InjectorUtils.taxiInstance;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taxi.service.ManufacturerService;

public class DeleteManufacturerController extends HttpServlet {
    private final ManufacturerService manufacturerService = (ManufacturerService)
            taxiInstance().getInstance(ManufacturerService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        manufacturerService.delete(Long.parseLong(req.getParameter("id")));
        resp.sendRedirect(req.getContextPath() + "/manufacturers");
    }
}
