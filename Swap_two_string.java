
//Java program to swap two string without using 3rd variable
package java_Project2;
import java.util.Scanner;
public class Swap_two_string 
{
public static void main(String[] args) {
try (Scanner scanner = new Scanner(System.in)) {
	System.out.print("Enter first string: ");
	String str1 = scanner.nextLine();
	System.out.print("Enter second string: ");
	String str2 = scanner.nextLine();
	System.out.println("Before swapping: str1 = " + str1 + ",str2 = " + str2);
	// Swapping without using a third variable
	str1 = str1 + str2; // Concatenate str1 and str2 andstore in str1
	str2 = str1.substring(0, str1.length() - str2.length());
	// Extract the initial part (original str1) from the concatenated string
	str1 = str1.substring(str2.length()); // Extract the remaining part (original str2) from the concatenated string
	System.out.println("After swapping: str1 = " + str1 + ", str2 = " + str2);
}
}
}