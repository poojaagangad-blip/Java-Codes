
//5.) Java program to Find Factorial on given Number

package Java_Project1;
import java.util.Scanner;

public class FactorialNumber {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial =1;
		try (Scanner scanner = new Scanner(System.in)) {
		}
		//System.out.print("Enter any number ");
		int number = 5;
		for (int i = 1; i <= number; i++){
			factorial = factorial * i;
		}
		System.out.println("Factorial of number is :" +factorial);

	}

}
