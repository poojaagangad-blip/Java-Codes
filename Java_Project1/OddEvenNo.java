
// 1.) Java program to Find Odd or Even number


package Java_Project1;
import java.util.Scanner;


public class OddEvenNo {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		
		int number = scanner.nextInt();
		if (number % 2 == 0)
		{
			System.out.println(number + " is even.");
		} 
		else
		{
			System.out.println(number + " is odd.");
		}

	}

}
