package calculadora.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="history")
public class History {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_history;
	
	private float input1;
	private float input2;
	private float result;
	
	@JoinColumn(name="id_user")
	@ManyToOne
	private User user;

	public History(User user) {
		this.user = user;
	}

	public float getInput1() {
		return input1;
	}

	public void setInput1(float input1) {
		this.input1 = input1;
	}

	public float getInput2() {
		return input2;
	}

	public void setInput2(float input2) {
		this.input2 = input2;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
