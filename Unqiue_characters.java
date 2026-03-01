


package java_Project2;
import java.util.Scanner;
public class Unqiue_characters
{
public static void main(String[] args) {
try (Scanner scanner = new Scanner(System.in)) {
	System.out.print("Enter a string: ");
	String input = scanner.nextLine();
	System.out.println("Unique characters in \"" + input + "\":");
	printUniqueCharacters(input);
}
}
public static void printUniqueCharacters(String str) {
// Assume ASCII characters (0-127), use boolean array to track poojacharacter occurrences;
boolean[] unique = new boolean[128];
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
if (!unique[ch]) {
unique[ch] = true;
System.out.print(ch + " ");
}
}
}
}