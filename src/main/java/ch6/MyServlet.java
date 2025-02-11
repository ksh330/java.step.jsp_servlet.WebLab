package ch6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */

@WebServlet(
	urlPatterns = {
			"/url1",
			"/url2"
	},
	initParams = {
			@WebInitParam(name="param1", value="param1.data"),
			@WebInitParam(name="param2", value="param2.data")
	}
)
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String data = null;
//		data .indexOf(0);
		
		PrintWriter out = response.getWriter();
		out.println("<h1>param test</h1>");
		String param1 = getInitParameter("param1");
		String param2 = getInitParameter("param2");
		out.println("param : " + param1 + ", " + param2);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
