package stringOperations;

public class StringOperator {
	
	public StringOperator() {
		
	}

	public String reverseString(String original) {
		String reversed = "";
		for (int i = original.length() - 1; i > -1; i--) 
			reversed = reversed + original.charAt(i);
		return reversed;
	}

	public boolean isPalindrome(String palindrome) {
		String reversed = reverseString(palindrome);
		for (int i = 0; i < palindrome.length(); i++) 
			if (palindrome.charAt(i) != reversed.charAt(i))
				return false;
		return true;
	}
}
