package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/WEB-INF/jspf/Declaration.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/LinksSources.html");
    _jspx_dependants.add("/WEB-INF/jspf/BarraDeNavegacionIndex.html");
    _jspx_dependants.add("/WEB-INF/jspf/ScriptsSources.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        ");
String title = "NEW LIGHTS";
      out.write("\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write('\n');
      out.write('\n');
    
    if ((title != null)&&(!title.equals(""))) {
        
    }else{
        title = "NEW LIGTHS";     
    }
    out.println("<title>"+title+"</title>");

      out.write('\n');
      out.write("\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("New Ligths\n");
      out.write("Services info Web\n");
      out.write("Rubio Haro \n");
      out.write("-->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"css/Estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("New Ligths\n");
      out.write("Services info Web\n");
      out.write("Rubio Haro \n");
      out.write("-->\n");
      out.write("<nav class=\"navbar navbar-default navbar-static-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                <span class=\"sr-only\">Este boton despliega la barra de navegaciÃ³n</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">NEW LIGHTS</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li><a href=\"#\"><span class=\"glyphicon glyphicon-heart\" aria-hidden=\"true\"></span>&nbsp;Conocenos</a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"glyphicon glyphicon-folder-open\" aria-hidden=\"true\"></span>&nbsp;Productos</a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"glyphicon glyphicon-phone\" aria-hidden=\"true\"></span>&nbsp;Contacto</a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"glyphicon glyphicon-film\" aria-hidden=\"true\"></span>&nbsp;Multimedia</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">                                \n");
      out.write("\n");
      out.write("                        <span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\" aria-hidden=\"true\"></span>&nbsp;Iniciar Sesion</a></li>\n");
      out.write("                <li><a href=\"registro.php\"><span class=\"glyphicon glyphicon-plus-sign\" aria-hidden=\"true\"></span>&nbsp;Registrarse</a></li>\n");
      out.write("            </ul>                   \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>       \n");
      out.write("\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("New Ligths\n");
      out.write("Services info Web\n");
      out.write("Rubio Haro \n");
      out.write("-->\n");
      out.write("<script src=\"js/jquery2.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>");
      out.write("                \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
