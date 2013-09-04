package calc.operators;

import calc.model.CompositeTerm;
import calc.model.Constant;
import calc.model.MinusTerm;
import calc.model.PlusTerm;
import calc.model.Term;

public class RemoveZeros implements CalcVisitor<Term> {
	
	@Override
	public Term visit(Constant term) {
		return term;
	}

	@Override
	public Term visit(PlusTerm pterm) {
		Term leftTerm = pterm.getLeftOperand().accept(this);
		Term rightTerm = pterm.getRightOperand().accept(this);
		if (isZeroConstant(leftTerm)) {
			return rightTerm;
		} else if (isZeroConstant(rightTerm)) {
			return leftTerm;
		} else {
			pterm.setLeftOperand(leftTerm);
			pterm.setRightOperand(rightTerm);
			return pterm;
		}
	}
		
	private boolean isZeroConstant(Term t) {
		return ((t instanceof Constant) && ((Constant) t).getValue() == 0);
	}
	
	@Override
	public Term visit(MinusTerm mterm) {
		Term leftTerm = mterm.getLeftOperand().accept(this);
		Term rightTerm = mterm.getRightOperand().accept(this);
		if (isZeroConstant(rightTerm)) {
			return leftTerm;
		} else if (isZeroConstant(leftTerm)) {
			//TODO
			return null;
		} else {
			mterm.setLeftOperand(leftTerm);
			mterm.setRightOperand(rightTerm);
			return mterm;
		}
	}

}
