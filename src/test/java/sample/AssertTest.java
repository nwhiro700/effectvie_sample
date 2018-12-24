package sample;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertTest {

	@Test
	void assertVariation() {
		Assertions.assertEquals("2nd test", getText(), "メッセージは3つめの引数");
		Assertions.assertEquals("2nd test", getText(), () -> "メッセージは Supplier でも渡せる");
		Assertions.assertTrue(true, "これは [true]");
		Assertions.assertFalse(false); // メッセージなし
		Assertions.assertNotEquals("いろいろなassertion", getText());
		Assertions.assertNotSame(new Something(), new Something(), () -> "notSame は reference の比較");
		Assertions.assertSame(something, something);
		Assertions.assertNotSame(something, new Something(), () -> "型が違うけど比較できる...");
		Assertions.assertNull(returnsNull());
		Assertions.assertNotNull(getText());
		Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6,7,8}, intArray(), () -> "配列のテスト");
}

private static final Object something = new Object();
private static class Something {}
	@Nonnull
	private String getText() {
    	return "2nd test";
	}
	@Nullable
	private String returnsNull() {
		return null;
	}
	@Nonnull
	private static int[] intArray() {
		return new int[]{1, 2, 3, 4, 5, 6, 7, 8};
	}
}