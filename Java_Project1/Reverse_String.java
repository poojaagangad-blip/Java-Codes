
//1.) Java program to reverse a string


package Java_Project1;
import java.util.Scanner;
public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		char ch;
		String nstr = "";
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			nstr = ch + nstr;

	}
		System.out.println("Reversed String is : " + nstr);
	}
}
