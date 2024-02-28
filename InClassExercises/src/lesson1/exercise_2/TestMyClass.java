package lesson1.exercise_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestMyClass {
	@Test
	public void testProduct() {
		int expected = -330;
		int TestArray []=  {2, 5, -3, 11, 1};
		int result =lesson1.exercise_1.MyClass.product(TestArray);
	assertEquals(expected,result);
	}
	
	@Test
	public void testConcatenate() {
		String expected = "ALMOST DONE";
		String TestArray []=  {"ALMOST"," ","DONE"};
		String result =lesson1.exercise_1.MyClass.concatenate(TestArray);
	assertEquals(expected,result);
	}
}
