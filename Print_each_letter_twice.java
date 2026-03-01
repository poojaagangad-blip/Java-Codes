
//Java program to print each letter twice from a given string

package java_Project2;
import java.util.Scanner;
public class Print_each_letter_twice
{
public static void main(String[] args) {
try (Scanner scanner = new Scanner(System.in)) {
	System.out.print("Enter a string: ");
	String input = scanner.nextLine();
	String doubledString = doubleCharacters(input);
	System.out.println("Doubled characters: " + doubledString);
}
}
public static String doubleCharacters(String str) {
StringBuilder doubled = new StringBuilder();
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
doubled.append(ch).append(ch); // Append each character twice
}
return doubled.toString();
}
}