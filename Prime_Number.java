package java_Project2;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=11;
boolean isPrime=true;
for(int i=2;i<=Math.sqrt(num);i++)
{
	if(num%i==0)
	{
		isPrime=false;
		break;
	}
}
 System.out.print(isPrime);
	}

}
