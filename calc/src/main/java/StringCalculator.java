/**
 * @author delf
 */
public class StringCalculator {
	public int calc(String formula) {

		StringParser stringParser = new StringParser();

		String operator = stringParser.getOperand(formula);
		int[] operands = stringParser.getOperands(formula);

		return Calculator.getCalculate(operator, operands[0], operands[1]);
	}
}