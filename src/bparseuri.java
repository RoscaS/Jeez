import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "b-parse-uri", value = "/b-parse-uri/*")
public class bparseuri extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");

        String name = req.getPathInfo().replace("/", "");

        try (PrintWriter writer = res.getWriter()) {
            writer.println("<h1>2. parse uri </h1>");
            writer.println("<h3>Salut " + name + " !</h3>");
        }
    }
}
