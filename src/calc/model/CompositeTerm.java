package calc.model;

public abstract class CompositeTerm extends Term {

	private Term leftOperand;
	public Term getLeftOperand() {
		return leftOperand;
	}

	public void setLeftOperand(Term leftOperand) {
		this.leftOperand = leftOperand;
	}

	public Term getRightOperand() {
		return rightOperand;
	}

	public void setRightOperand(Term rightOperand) {
		this.rightOperand = rightOperand;
	}

	private Term rightOperand;
	
	public CompositeTerm(Term leftOperand, Term rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}
	
}
