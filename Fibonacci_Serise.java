package java_Project2;

public class Fibonacci_Serise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10,num1=0,num2=1;
System.out.print("Fibonaci Serise:" +num1+" ,"+num2);
for(int i=2;i<n;i++)
{
	int num3 = num1 + num2;
	System.out.print(","+num3);
	num1=num2;
	num2=num3;
}
	}

}
