package calc.model;

import calc.operators.CalcVisitor;

public class PlusTerm extends CompositeTerm {

	public PlusTerm(Term leftOperand, Term rightOperand) {
		super(leftOperand, rightOperand);
	}

	@Override
	public <T> T accept(CalcVisitor<T> visitor) {
		getLeftOperand().accept(visitor);
		getRightOperand().accept(visitor);
		return visitor.visit(this);
	}
	
}
