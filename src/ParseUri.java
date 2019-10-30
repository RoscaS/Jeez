import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "e-parse-uri", value = "/parse-uri/*")
public class ParseUri extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");

        String name = req.getPathInfo().replace("/", "");

        try (PrintWriter writer = res.getWriter()) {
            String home = "<a style='margin-left: 20px; font-size: 12px' href='/Jeez'>Home</a>";
            writer.println("<h1>5. parse uri " + home +  "</h1>");
            writer.println("<h3>Salut " + name + " !</h3>");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
