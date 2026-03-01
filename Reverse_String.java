// Write a java code for Reverse a string.

package java_Project2;

public class Reverse_String {

	public static void main(String[] args)
	{
		String str =" Hello World ";
		
		StringBuilder reversed = new StringBuilder(str).reverse();
		System.out.println(reversed);
	}
}
