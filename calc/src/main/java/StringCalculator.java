import java.util.Arrays;

/**
 * @author delf
 */
public class Calculator {
	public int calc(String formula) {

		StringParser stringParser = new StringParser();

		char operator = stringParser.getOperand(formula);
		int[] operands = stringParser.getOperands(formula);

		switch (operator) {
			case '+':
				return operands[0] + operands[1];
			case '-':
				return operands[0] - operands[1];
			case '*':
				return operands[0] * operands[1];
			case '/':
				return operands[0] / operands[1];
		}

		return 0;
	}
}