package java_Project2;

public class Palindrome_String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "madam";
 
 	String reversed = new StringBuilder(str).reverse().toString();
	System.out.println(str.equals(reversed));
	}

}
