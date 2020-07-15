package calculadora.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="calculator")
public class Calculator {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_calculator;
	
	
	@JoinColumn(name="id_user")
	@ManyToOne
	private User user;

	public Calculator(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
