package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ma.school.service.MarqueService;
import ma.school.beans.Marque;
import ma.school.service.MachineService;
import java.util.List;
import ma.school.beans.Machine;

public final class graphe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Histogramme de machines par marque</title>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\n");
      out.write("    <link href=\"style/css1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f7f7f7;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        .center-div {\n");
      out.write("            text-align: center;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        canvas#machineChart {\n");
      out.write("            width: 100%;\n");
      out.write("            margin: 2px auto;\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 24px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("   \n");
      out.write("    <div class=\"center-div\">\n");
      out.write("        <div style=\"background-color: #fff; border: 1px solid #ddd; padding: 20px; width: 400px; height: 550px;\">\n");
      out.write("            <h1 style=\"text-align: center;\">Histogramme de machines par marque</h1>\n");
      out.write("            <canvas id=\"machineChart\"></canvas>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");

        MachineService ms = new MachineService();
        MarqueService mrs = new MarqueService();
        List<Marque> marques = mrs.findAll();
    
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var labels = [];\n");
      out.write("        var data = [];\n");
      out.write("        var backgroundColors = [];\n");
      out.write("        ");

            for (Marque marque : marques) {
        
      out.write("\n");
      out.write("        labels.push(\"");
      out.print( marque.getLibelle());
      out.write("\");\n");
      out.write("        data.push(");
      out.print( ms.findByMarque(marque).size());
      out.write(");\n");
      out.write("        backgroundColors.push('rgba(54, 162, 235, 0.6)'); // Blue color for bars\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("        var selectedType = 'bar';\n");
      out.write("        var ctx = document.getElementById('machineChart').getContext('2d');\n");
      out.write("        var machineChart = new Chart(ctx, {\n");
      out.write("            type: selectedType,\n");
      out.write("            data: {\n");
      out.write("                labels: labels,\n");
      out.write("                datasets: [{\n");
      out.write("                    label: 'Nombre de machines par marque',\n");
      out.write("                    data: data,\n");
      out.write("                    backgroundColor: backgroundColors,\n");
      out.write("                    borderColor: 'rgba(54, 162, 235, 1)',\n");
      out.write("                    borderWidth: 1\n");
      out.write("                }]\n");
      out.write("            },\n");
      out.write("            options: {\n");
      out.write("                scales: {\n");
      out.write("                    y: {\n");
      out.write("                        beginAtZero: true,\n");
      out.write("                        suggestedMax: 10\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
