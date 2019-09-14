/**
 * @author delf
 */
public class Calculator {

	public static int getCalculate(String operator, int a, int b)  {
		switch (operator) {
			case "+":
				return a + b;
			case "-":
				return a - b;
			case "*":
				return a * b;
			case "/":
				return a / b;
		}
		return Integer.MIN_VALUE;
	}
}
