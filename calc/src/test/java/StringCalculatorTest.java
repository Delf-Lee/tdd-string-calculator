import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author delf
 */
public class StringCalculatorTest {

	private StringCalculator calculator;

	@Before
	public void init() {
		calculator = new StringCalculator();
	}

	@Test
	public void 덧셈이_정상적으로_동작한다() {
		assertThat(calculator.calc("12+3"), equalTo(15));
	}

	@Test
	public void 뺼셈이_정상적으로_동작한다() {
		assertThat(calculator.calc("12-3"), equalTo(9));
	}

	@Test
	public void 곱셈이_정상적으로_동작한다() {
		assertThat(calculator.calc("12*3"), equalTo(36));
	}

	@Test
	public void 나눗셈이_정상적으로_동작한다() {
		assertThat(calculator.calc("12/3"), equalTo(4));
	}
}
