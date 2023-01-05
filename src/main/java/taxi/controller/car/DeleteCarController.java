package taxi.controller.car;

import static taxi.lib.InjectorUtils.taxiInstance;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taxi.service.CarService;

public class DeleteCarController extends HttpServlet {
    private final CarService carService = (CarService) taxiInstance()
            .getInstance(CarService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        carService.delete(Long.parseLong(req.getParameter("id")));
        resp.sendRedirect(req.getContextPath() + "/cars");
    }
}
