package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class ServletSample extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletSample() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
        String age = request.getParameter("age");

        response.setContentType("text/html; charset=UTF8");
		PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Hello World!</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>Hello World!</h1>");
	    out.println("<p> Name ->" + name + "</p>");
	    out.println("<p> Age ->" + age + "</p>");
	    out.println("<a href=\"test1.jsp\">戻る</a>");
	    out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
        String age = request.getParameter("age");

        response.setContentType("text/html; charset=UTF8");
		PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Hello World!</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>Hello World!</h1>");
	    out.println("<p> Name ->" + name + "</p>");
	    out.println("<p> Age ->" + age + "</p>");
	    out.println("<a href=\"test1.jsp\">戻る</a>");
	    out.println("</body></html>");
	}

}
