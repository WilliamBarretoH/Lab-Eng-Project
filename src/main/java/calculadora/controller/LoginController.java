package calculadora.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculadora.model.dao.UserDAO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		} catch (Exception e){
			System.out.println("Erro em IO ou no Servlet");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDAO userDAO = new UserDAO();
		try {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			PrintWriter out1 = response.getWriter();
			if(userDAO.validate(email, password)) {
			
				System.out.println("USUARIO VALIDADO");
				response.sendRedirect("/calculadora/list");
				
				out1.println("usuario validado");
				
			}else {
				System.out.println("USUARIO INVALIDO");
				response.sendRedirect("/calculadora/login");
				out1.println("usuario validado");
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}


















