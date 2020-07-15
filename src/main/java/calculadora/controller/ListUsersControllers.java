package calculadora.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculadora.model.entity.User;
import calculadora.model.dao.UserDAO;

@WebServlet("/list")
public class ListUsersControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDAO userDAO = new UserDAO();
		List<User> users = userDAO.listAll();
		request.setAttribute("users", users);
		request.getRequestDispatcher("/listUsers.jsp").forward(request, response);
		
		PrintWriter out;
	}

}
