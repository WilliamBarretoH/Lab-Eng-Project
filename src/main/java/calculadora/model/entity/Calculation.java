package calculadora.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="calculation")
public class Calculation {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_calculation;
	
	private float input1;
	private float input2;
	private float result = 0;
	
	@JoinColumn(name="id_calculator")
	@ManyToOne
	private Calculator calculator;
	
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
	
	public Calculator getCalculator() {
		return calculator;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	
}
