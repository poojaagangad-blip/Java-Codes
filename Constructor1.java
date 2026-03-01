package java_Project2;


public class Constructor1 {
int x;  // Create a class attribute

// Create a class constructor for the Main class
public Constructor1() {
 x = 5;  // Set the initial value for the class attribute x
}

public static void main(String[] args) {
	Constructor1 myObj = new Constructor1(); // Create an object of class Main (This will call the constructor)
 System.out.println(myObj.x); // Print the value of x
}
}