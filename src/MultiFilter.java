import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "d-multi-filter", urlPatterns = "*")
public class MultiFilter implements Filter {

    public void doFilter(ServletRequest req,
                         ServletResponse resp,
                         FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest) req;

        StringBuilder message = new StringBuilder("\nRequest to ")
                .append(request.getRequestURI()).append("Intercepted (d-multi-filter)")
                .append("\nContextPath: ").append(request.getContextPath())
                .append("\nServletPath: ").append(request.getServletPath())
                .append("\nPathInfo: ").append(request.getPathInfo());

        System.out.println(message.append("\n"));


        chain.doFilter(req, resp);
    }

    public void destroy() {}
    public void init(FilterConfig config) { }

}
