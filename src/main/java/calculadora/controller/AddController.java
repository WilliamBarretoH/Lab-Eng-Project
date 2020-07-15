package calculadora.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculadora.model.entity.User;
import calculadora.model.builder.UserBuilder;
import calculadora.model.dao.UserDAO;

@WebServlet("/addUser")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			request.getRequestDispatcher("/formUser.jsp").forward(request, response);
		} catch (Exception e){
			System.out.println("Erro em IO ou no Servlet");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			UserBuilder userBuilder = new UserBuilder().init().buildEmail(email).buildPassword(password);
			User user = userBuilder.createUser();
			UserDAO userDAO = new UserDAO();
			userDAO.createUser(user);
			
		}catch (Exception e) {
			System.out.println("Erro em IO ou no Servlet");		
			}
	}

}
