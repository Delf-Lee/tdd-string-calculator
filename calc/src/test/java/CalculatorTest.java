import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * @author delf
 */
public class CalculatorTest {

	@Test
	public void 덧셈이_정상적으로_동작한다() {
		assertThat(5, equalTo(Calculator.getCalculate("+", 2, 3)));
	}

	@Test
	public void 뺄셈이_정상적으로_동작한다() {
		assertThat(-1, equalTo(Calculator.getCalculate("-", 2, 3)));
	}

	@Test
	public void 곱셈이_정상적으로_동작한다() {
		assertThat(6, equalTo(Calculator.getCalculate("*", 2, 3)));
	}

	@Test
	public void 나눗셈이_정상적으로_동작한다() {
		assertThat(2, equalTo(Calculator.getCalculate("/", 4, 2)));
	}
}
