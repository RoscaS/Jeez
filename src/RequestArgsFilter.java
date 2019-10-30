import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebFilter(filterName = "c-request-args-filter", servletNames = "b-request-args")
public class RequestArgsFilter implements Filter {

    public void doFilter(ServletRequest req,
                         ServletResponse resp,
                         FilterChain chain) throws ServletException, IOException {

        if (req instanceof HttpServletRequest) {

            HttpServletRequest request = (HttpServletRequest) req;
            String uri = request.getRequestURI();
            System.out.println("\nRequest to " + uri + " intercepted (c-request-args-filter)");


            if (req.getParameter("name") == null || req.getParameter("name").equals("")) {
                String redirect = uri + "?name=Inconnu";
                HttpServletResponse response = (HttpServletResponse) resp;
                System.out.println("Redirecting to" + redirect + "\n");
                response.sendRedirect(redirect);
            }
        }

        chain.doFilter(req, resp);
    }

    public void destroy() {}
    public void init(FilterConfig config) { }

}
