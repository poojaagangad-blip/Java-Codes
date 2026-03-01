package java_Project2;

public class Constructor2 {
	  int x;

	  public Constructor2(int y) {
	    x = y;
	  }

	  public static void main(String[] args) {
		  Constructor2 myObj = new Constructor2(5);
	    System.out.println(myObj.x);
	  }
	}
