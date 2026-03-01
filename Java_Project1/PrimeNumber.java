

// 2.) Java program to find Prime number


package Java_Project1;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int number = scanner.nextInt();
		
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} 
		else
		{
			System.out.println(number + " is not a prime number.");

		}

	}
	public static boolean isPrime(int num)
	{
		for (int i = 2; i <= num / 2; i++) 
		{
			if (num % i == 0) 
			{
				return false;
			}
		}
	      return true;
	 }
}

