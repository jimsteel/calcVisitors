package calc.operators;

import calc.model.Constant;
import calc.model.MinusTerm;
import calc.model.PlusTerm;
import calc.model.Term;

public class Printer implements CalcVisitor<String> {

	@Override
	public String visit(Constant term) {
		return Integer.toString(term.getValue());
	}

	@Override
	public String visit(PlusTerm term) {
		String left = term.getLeftOperand().accept(this);
		String right = term.getRightOperand().accept(this);
		return '(' + left + " + " + right + ')';
	}

	@Override
	public String visit(MinusTerm term) {
		String left = term.getLeftOperand().accept(this);
		String right = term.getRightOperand().accept(this);
		return '(' + left + " - " + right + ')';
	}

}
