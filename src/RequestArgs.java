import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "b-request-args", value = "/request-args")
public class RequestArgs extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");

        // String nameArg = req.getParameter("name");
        // String name = nameArg != null ? nameArg : "inconnu";

        try (PrintWriter writer = res.getWriter()) {
            String home = "<a style='margin-left: 20px; font-size: 12px' href='/Jeez'>Home</a>";
            writer.println("<h1>2. Request Args " + home + "</h1>");
            writer.println("<h3>Bonjour " + req.getParameter("name") + " !</h3>");
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) {

    }
}
