package calc.model;

import calc.operators.CalcVisitor;

public class Constant extends Term {

	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Constant(int value) {
		this.value = value;
	}

	@Override
	public <T> T accept(CalcVisitor<T> visitor) {
		return visitor.visit(this);
	}

	
}
