
//10.) Java program to calculate the sum of digits of a number 

package Java_Project1;
public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12345;
		int sumOfDigits = calculateSumOfDigits(number);
		System.out.println("Sum of digits of " + number + " is: " + sumOfDigits);
	}
	public static int calculateSumOfDigits(int number) {
		int sum = 0;
		while (number > 0) {
			int digit = number % 10; 
			sum = sum + digit; 
			number = number / 10; 
		}
		
		return sum;
	}
}
