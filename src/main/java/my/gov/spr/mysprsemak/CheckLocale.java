package my.gov.spr.mysprsemak;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckLocale
 */
public class CheckLocale extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckLocale() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// Get the  Locale information 
        // by using java.util.Locale
        Locale locale = request.getLocale();
         
        // language 
        String localeLanguage = locale.getLanguage();
         
        // country
        String localeCountry = locale.getCountry();

        // Print the  response content type 
        // below by using PrintWriter object
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        String title = "Locale detection";
        String docType =
           "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
         
        printWriter.println(docType +
           "<html>\n" +
              "<head><title>" + title + "</title></head>\n" +
              "<body bgcolor = \"#145A32\">\n" +
                 "<h1 align = \"Left\"> " + "<font color=\"white\">"  + "Language : " + localeLanguage + "</font>" + "</h1>\n" +
                 "<h2 align = \"Left\">" + "<font color=\"white\">" + "Country    : " + localeCountry + "</font>" + "</h2>\n" +
           "</body>" +
           "</html>"
        );   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
