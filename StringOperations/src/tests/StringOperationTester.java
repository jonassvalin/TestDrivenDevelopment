package tests;

import stringOperations.StringOperator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringOperationTester {
	StringOperator stringOperator;

	@Before
	public void setUp() throws Exception {
		stringOperator = new StringOperator();
	}

	@Test
	public void testNotNull() {
		assertNotNull(stringOperator);
	}
	
	@Test
	public void testReverseStringTrue() {
		String original = "hello";
		String expected = "olleh";
		assertEquals(expected, stringOperator.reverseString(original));
	}
	
	@Test
	public void testReverseStringFalse() {
		String original = "hello";
		assertNotEquals(original, stringOperator.reverseString(original));
	}
	
	@Test
	public void testIsPalindromeTrue() {
		String palindrome = "redivider";
		assertTrue(stringOperator.isPalindrome(palindrome));
	}
	
	@Test
	public void testIsPalindromeFalse() {
		String nonPalindrome = "redivide";
		assertFalse(stringOperator.isPalindrome(nonPalindrome));
	}

}
