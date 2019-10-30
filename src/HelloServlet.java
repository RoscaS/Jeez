import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "a-hello-servlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");


        try (PrintWriter writer = res.getWriter()) {
            String home = "<a style='margin-left: 20px; font-size: 12px' href='/Jeez'>Home</a>";
            writer.println("<h1>1. Hello servlet ! " + home +  "</h1>");
        }
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse res) {

    }
}
