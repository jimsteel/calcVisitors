package calc.operators;

import calc.model.Constant;
import calc.model.MinusTerm;
import calc.model.PlusTerm;
import calc.model.Term;

public interface CalcVisitor<T> {
	
	public T visit(Constant term);
	public T visit(PlusTerm term);
	public T visit(MinusTerm term);
	
}
