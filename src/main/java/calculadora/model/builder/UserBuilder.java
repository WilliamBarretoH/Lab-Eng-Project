package calculadora.model.builder;

import calculadora.model.entity.User;

public class UserBuilder {
	
	private User user; 
	
	public UserBuilder init() {
		this.user = new User();
		return this;
	}
	
	public UserBuilder buildEmail(String email) {
		this.user.setEmail(email);
		return this;
	}
	
	public UserBuilder buildPassword(String password) {
		this.user.setPassword(password);
		return this;
	}
	
	public User createUser() {
		return this.user;
	}
	

}
