package calc.model;

import calc.operators.CalcVisitor;

public abstract class Term {
	public abstract <T> T accept(CalcVisitor<T> visitor);
}
