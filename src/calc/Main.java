package calc;

import calc.model.Constant;
import calc.model.MinusTerm;
import calc.model.PlusTerm;
import calc.model.Term;
import calc.operators.Evaluator;
import calc.operators.Printer;
import calc.operators.RemoveZeros;

public class Main {

	public static void main(String[] args) {

		Term four = new Constant(4);
		Term eight = new Constant(8);
		Term one = new Constant(1);
		Term two = new Constant(2);

		PlusTerm three = new PlusTerm(one, two);
		PlusTerm seven = new PlusTerm(four, three);
		PlusTerm sixteen = new PlusTerm(eight,eight);
		MinusTerm nine = new MinusTerm(sixteen,seven);

		System.out.println("Evaluating");
		Printer p = new Printer();
		Evaluator eval = new Evaluator();
		RemoveZeros removeZeros = new RemoveZeros();
		System.out.println(two.accept(p) + " is " + two.accept(eval));
		System.out.println(three.accept(p) + " is " + three.accept(eval));
		System.out.println(nine.accept(p) + " is " + nine.accept(eval));
		
		Term zero = new Constant(0);
		Term zerosum1 = new PlusTerm(zero,zero);
		Term zerosum2 = new PlusTerm(zero,two);
		Term zerosum3 = new PlusTerm(two,zerosum2);
		System.out.println(zero.accept(p) + " becomes " + zero.accept(removeZeros).accept(p));
		System.out.println(zerosum1.accept(p) + " becomes " + zerosum1.accept(removeZeros).accept(p));
		System.out.println(zerosum2.accept(p) + " becomes " + zerosum2.accept(removeZeros).accept(p));
		System.out.println(zerosum3.accept(p) + " becomes " + zerosum3.accept(removeZeros).accept(p));

	}
}
