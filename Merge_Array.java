package java_Project2;
import java.util.Arrays;
public class Merge_Array {

	public static void main(String[] args) {
		
int[] arr1 ={1,3,5};
int[] arr2 = {2,4,6};
int[] mearged= new int[arr1.length+arr2.length];
	System.arraycopy(arr1, 0, mearged, 0, arr1.length);	
	System.arraycopy(arr2, 0, mearged, arr1.length,arr2.length);
	}

}
