import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "a-request-args", value = "/a-request-args")
public class arequestargs extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");

        String nameArg = req.getParameter("name");
        String name = nameArg != null ? nameArg : "inconnu";

        try (PrintWriter writer = res.getWriter()) {
            writer.println("<h1>1. Request Args </h1>");
            writer.println("<h3>Bonjour " + name + " !</h3>");
        }
    }
}
