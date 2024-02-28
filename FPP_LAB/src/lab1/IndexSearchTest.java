package lab1;

import static org.junit.Assert.*;

import org.junit.*;


public class IndexSearchTest {
	private IndexSearch indexSearch;
	@Before
	public void setup() {
		indexSearch = new IndexSearch();
	}
	
	
	
	@Test
	public void targetFirst() {
		int expected = 0;
		int[] testArray = { 1, 2, 3 };
		int target = testArray[0];
		assertEquals(indexSearch.search(testArray, target), expected);
	}

	@Test
	public void targetLast() {

		int[] testArray = { 1, 2, 3 };
		int expected = testArray.length - 1;
		int target = testArray[testArray.length - 1];
		assertEquals(IndexSearch.search(testArray, target), expected);
	}

	@Test
	public void targetMiddle() {
		int[] testArray = { 1, 2, 3 };
		int expected = testArray.length/2;
		int target = testArray[testArray.length/2];
		assertEquals(IndexSearch.search(testArray, target), expected);

	}
	
	@Test
	public void targetNotInArray() {
		int[] testArray = { 1, 2, 3 };
		int expected = -1;
		int target = 87;
		assertEquals(IndexSearch.search(testArray, target), expected);

	}
	@Test
	public void targetFirstOccurance() {
		int[] testArray = { 1, 2, 3,3,3 };
		int expected = 2;
		int target = 3;
		assertEquals(IndexSearch.search(testArray, target), expected);

	}
	@Test
	public void targetNotHereWithSize1Array() {
		int[] testArray = {1};
		int expected = -1;
		int target = 3;
		assertEquals(IndexSearch.search(testArray, target), expected);
	}
	@Test
	public void targetHereWithSize1Array() {
		int[] testArray = { 1 };
		int expected = 0;
		int target = 1;
		assertEquals(IndexSearch.search(testArray, target), expected);
	}
	@Test
	public void emptyArray() {
		int[] testArray = {};
		int expected = -1;
		int target = 3;
		assertEquals(IndexSearch.search(testArray, target), expected);
	}
	
}
