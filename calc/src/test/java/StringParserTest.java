import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * @author delf
 */
public class StringParserTest {
	private StringParser stringParser = new StringParser();

	@Test
	public void 문자열에서_숫자를_추출한다() {
		int[] operands = stringParser.getOperands("2+3");
		assertThat(2, equalTo(operands[0]));
		assertThat(3, equalTo(operands[1]));
	}

	@Test
	public void 문자열에서_연산자를_추출한다() {
		String operator = stringParser.getOperand("2+3");
		assertThat("+", equalTo(operator));
	}
}
