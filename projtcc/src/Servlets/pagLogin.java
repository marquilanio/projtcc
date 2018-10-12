package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/pagLogin")
public class pagLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String userID = "DBAFASE";
	private final String password = "fase";
       
    public pagLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pwd = request.getParameter("password");
		
		if(userID.equals(user) && password.equals(pwd)){
			HttpSession session = request.getSession();
			session.setAttribute("user", "Admin");
			response.sendRedirect("Cadastro_Paciente.jsp");
		}else{
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/LoginHospital.html");
			PrintWriter out= response.getWriter();
			out.println("<font color=red>Usuário/senha errado(s).</font>");
			rd.include(request, response);
		}
	}

}
