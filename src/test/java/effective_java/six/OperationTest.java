package effective_java.six;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperationTest {

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	@DisplayName("列挙クラスのToStringテスト")
	public void test1() {

		Operation ope = Operation.DIVIDE;

		String str = ope.toString();

		Assertions.assertEquals("/", str);

	}

	@Test
	@DisplayName("足し算のテスト")
	public void test2() {

		double x = 5;
		double y = 2;

		double result = Operation.PLUS.apply(x, y);

		Assertions.assertEquals(x + y, result);
	}

	@Test
	@DisplayName("引き算のテスト")
	public void test3() {

		double x = 5;
		double y = 2;

		double result = Operation.MINUS.apply(x, y);

		Assertions.assertEquals(x - y, result);
	}


	@Test
	@DisplayName("掛け算のテスト")
	public void test4() {

		double x = 5;
		double y = 2;

		double result = Operation.TIMES.apply(x, y);

		Assertions.assertEquals(x * y, result);
	}

	@Test
	@DisplayName("割り算のテスト")
	public void test5() {

		double x = 5;
		double y = 2;

		double result = Operation.DIVIDE.apply(x, y);

		Assertions.assertEquals(x / y, result);
	}


}
