package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class etiquetapersonalizada2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/bodyp.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_Cuerpo_cuerpo;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_Cuerpo_cuerpo = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_Cuerpo_cuerpo.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<body>\r\n");
      if (_jspx_meth_Cuerpo_cuerpo_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_Cuerpo_cuerpo_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  Cuerpo:cuerpo
    com.escom.Body _jspx_th_Cuerpo_cuerpo_0 = (com.escom.Body) _jspx_tagPool_Cuerpo_cuerpo.get(com.escom.Body.class);
    _jspx_th_Cuerpo_cuerpo_0.setPageContext(_jspx_page_context);
    _jspx_th_Cuerpo_cuerpo_0.setParent(null);
    int _jspx_eval_Cuerpo_cuerpo_0 = _jspx_th_Cuerpo_cuerpo_0.doStartTag();
    if (_jspx_eval_Cuerpo_cuerpo_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_Cuerpo_cuerpo_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_Cuerpo_cuerpo_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_Cuerpo_cuerpo_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("1,2,3,4;\r\n");
        out.write("2,12,3,9;\r\n");
        int evalDoAfterBody = _jspx_th_Cuerpo_cuerpo_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_Cuerpo_cuerpo_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_Cuerpo_cuerpo_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_Cuerpo_cuerpo.reuse(_jspx_th_Cuerpo_cuerpo_0);
      return true;
    }
    _jspx_tagPool_Cuerpo_cuerpo.reuse(_jspx_th_Cuerpo_cuerpo_0);
    return false;
  }
}
