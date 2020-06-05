/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author eric
 */
public class FiltroLogin implements Filter{
    private ServletContext context;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        context=filterConfig.getServletContext();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res =(HttpServletResponse) response;
        int num;
        try{
            num = Integer.parseInt(req.getSession().getAttribute("try").toString());
        }catch(Exception e){
            req.getSession().setAttribute("try",0);
            num=0;
        }
        num++;
        req.getSession().setAttribute("try",num);
        context.log("Intento login: "+num+" desde "+req.getRemoteAddr());
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        
    }
    
}
