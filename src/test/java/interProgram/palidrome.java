package interProgram;

import org.testng.annotations.Test;

public class palidrome {
	String s = "madam";
	String k = "";

	@Test
	public void gg() {
		for (int i = s.length() - 1; i >= 0; i--) {
			k = k + s.charAt(i);
		}
		System.out.println(k);
		if (k.equals("madam")) {
			System.out.println("palindrome");
		}
	}

}