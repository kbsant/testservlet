package testservlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class TestServlet extends HttpServlet {
    @Override
   public void doGet(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException {
        try {
            resp.getOutputStream().println("Hello World");
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
    }
}
