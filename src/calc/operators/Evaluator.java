package calc.operators;

import java.util.logging.Logger;

import calc.model.Constant;
import calc.model.MinusTerm;
import calc.model.PlusTerm;
import calc.model.Term;

public class Evaluator implements CalcVisitor<Integer> {

	private Logger logger = Logger.getLogger("calc.operators.Evaluator");
	
	@Override
	public Integer visit(Constant c) {
		logger.info("Evaluating Constant");

		return c.getValue();
	}
	
	@Override
	public Integer visit(PlusTerm pt) {
		logger.info("Evaluating PlusTerm");
		int left = pt.getLeftOperand().accept(this);
		int right = pt.getRightOperand().accept(this);
		return left + right;
	}
	
	@Override
	public Integer visit(MinusTerm pt) {
		logger.info("Evaluating MinusTerm");
		int left = pt.getLeftOperand().accept(this);
		int right = pt.getRightOperand().accept(this);
		return left - right;
	}

	
}
