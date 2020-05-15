package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrationForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"cssRegistrationProject.css\">                        \n");
      out.write("    <title>Registration Page</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <h1>Registration Page</h1>\n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("  ");
 String  name
          , password
          , errmsg
          ;
  
     name = request.getParameter("name");
     password  = request.getParameter("password");
     errmsg = (String) request.getAttribute("errmsg");
     
     if (name==null) name = "";
     if (password==null)  password  = ""; 
     if (errmsg==null)    errmsg    = " "; 
   
      out.write("\n");
      out.write("\n");
      out.write("  <div class=registrationWrapper>\n");
      out.write("  <form action=\"/RegistrationProject-war/RegistrationServlet\" method=\"get\">\n");
      out.write("    <table border=\"0\" align=\"left\">\n");
      out.write("    \t<tr>\n");
      out.write("            <td>Name </td>\n");
      out.write("            <td><input type=\"text\" size=\"25\" name=\"name\" value=\"");
      out.print(name);
      out.write("\"/></td>\n");
      out.write("        </tr>\n");
      out.write("    \t<tr>\n");
      out.write("            <td>Password</td>\n");
      out.write("            <td><input type=\"text\" size=\"25\" name=\"password\" value=\"");
      out.print(password);
      out.write("\"/></td>\n");
      out.write("        </tr>\n");
      out.write("    \t\n");
      out.write("    \t<tr>\n");
      out.write("            <td>Submit </td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"submit\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Message</td>\n");
      out.write("            <td>\n");
      out.write("                <textarea cols=\"30\" rows=\"4\" name=\"errormsg\">");
      out.print(errmsg);
      out.write("</textarea>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("  </form>\n");
      out.write("  </div>\n");
      out.write("            \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
