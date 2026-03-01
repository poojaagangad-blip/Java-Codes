package java_Project2;

public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {1,3,5,7,9};
int largest=arr[0];
for(int num:arr)
{
	if(num>largest)
	{
		largest=num;
	}
}
System.out.println(largest);
	}

}
