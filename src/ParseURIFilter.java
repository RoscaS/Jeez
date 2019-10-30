import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "f-parse-uri-filter", servletNames = "e-parse-uri")
public class ParseURIFilter implements Filter {


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest) req;
        String uri = request.getRequestURI();

        System.out.println("\nRequest to " + uri + " intercepted (f-parse-uri-filter)");

        String name = request.getPathInfo().replace("/", "");

        if (name.equals("")) {
            String redirect = uri + "Inconnu";
            HttpServletResponse response = (HttpServletResponse) resp;
            System.out.println("Redirecting to " + redirect + "\n");
            response.sendRedirect(redirect);
        }

        chain.doFilter(req, resp);
    }

    public void destroy() {}

    public void init(FilterConfig config) {}

}
