package calculadora.controller;


import calculadora.model.dao.HistoryDAO;
import calculadora.model.dao.UserDAO;
import calculadora.model.entity.History;
import calculadora.model.entity.User;

public class Teste {

	
	public static void main(String[] args) {
	
		UserDAO ud = new UserDAO();
		HistoryDAO historyDAO = new HistoryDAO();
		
		String email = "will";
		String password = "12356";
		
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		
		float input1 = 4;
		float input2 = 3;
		float result = input1 + input2;
		//ud.createUser(user);
		
		History history1 = new History(user);
		
		
		
		historyDAO.createHistory(history1);
		
		
		
		
		
		
		System.out.println("email encontrado" + user.getEmail());
	}
}
