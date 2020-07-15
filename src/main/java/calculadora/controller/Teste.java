package calculadora.controller;

import calculadora.model.entity.User;
import calculadora.model.dao.UserDAO;

public class Teste {

	
	public static void main(String[] args) {
	
		UserDAO ud = new UserDAO();
		
		String email = "will";
		String password = "12356";
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		
//		ud.createUser(user);
		
//		user = ud.findByEmail(email);
		
		if(ud.validate(email, password)) {
			System.out.println("usuario validado");
			
		}else {
			System.out.println("usuario invalido");
		}
		
		System.out.println("email encontrado" + user.getEmail());
	}
}
