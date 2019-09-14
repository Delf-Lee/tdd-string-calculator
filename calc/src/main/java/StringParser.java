import java.util.Arrays;

/**
 * @author delf
 */
public class StringParser {
	public static final String[] OPERATORS = {"+", "-", "*", "/"};

	public int[] getOperands(String formula) {
		StringBuilder operands = new StringBuilder();
		for (char ch : formula.toCharArray()) {
			operands.append(Character.isDigit(ch) ? ch : " ");
		}
		String[] op = operands.toString().split(" ");
		return Arrays.stream(op).mapToInt(Integer::parseInt).toArray();
	}

	public String getOperand(String formula) {
		for (String ch : OPERATORS) {
			if (formula.contains(ch)) {
				return String.valueOf(ch.charAt(0));
			}
		}
		throw new IllegalArgumentException();
	}
}
