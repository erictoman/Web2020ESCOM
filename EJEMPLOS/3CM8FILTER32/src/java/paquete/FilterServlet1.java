package paquete;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class FilterServlet1 implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        String ip = request.getRemoteAddr();
        System.out.println("IP:"+ip + ", TIEMPO:"+ new Date().toString());
        chain.doFilter(req, res);
    }
    @Override
    public void init(FilterConfig config) throws ServletException {
        String parametroprueba = config.getInitParameter("parametroprueba");
        System.out.println("Parametro de prueba: " + parametroprueba);
    }
    @Override
    public void destroy() {
        
    }
}