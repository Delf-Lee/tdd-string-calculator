import java.util.Arrays;

/**
 * @author delf
 */
public class Calculator {
	private static final String[] OPERATORS = {"+", "-", "*", "/"};

	public int calc(String formula) {

		char operator = getOperand(formula);
		int[] operands = getOperands(formula);

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

	private int[] getOperands(String formula) {
		StringBuilder operands = new StringBuilder();
		for (char ch : formula.toCharArray()) {
			operands.append(Character.isDigit(ch) ? ch : " ");
		}
		String[] op = operands.toString().split(" ");
		return Arrays.stream(op).mapToInt(Integer::parseInt).toArray();
	}

	private char getOperand(String formula) {
		for (String ch : OPERATORS) {
			if (formula.contains(ch)) {
				return ch.charAt(0);
			}
		}
		throw new IllegalArgumentException();
	}

}
