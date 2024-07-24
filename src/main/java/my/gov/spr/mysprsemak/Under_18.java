package my.gov.spr.mysprsemak;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Under_18
 */
public class Under_18 extends HttpServlet {
	
	String message;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Under_18() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	message = "Starting the system ...";
    }	
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println(message);
		System.out.println("System is running");
		response.setContentType("text/html");
		System.out.println("you are under 18");
		
		PrintWriter printWrite = response.getWriter();
		String data = request.getParameter("name");
		
		if(data.equals("John")) {
			printWrite.print("<h1>First Link Request locale : " + request.getLocale() + "</h1>");
		} else if(data.equals("Ali")) {
			printWrite.print("<h1>Second Link Request locale : " + request.getLocale() + "</h1>");
		} else {
			printWrite.print("<h1>Third Link Request locale : " + request.getLocale() + "</h1>");
		}
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("System is to destroy");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
