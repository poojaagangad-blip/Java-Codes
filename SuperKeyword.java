package java_Project2;

class Animal3 {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Dog2 extends Animal3 {
	  public void animalSound() {
	    super.animalSound(); // Call the parent method
	    System.out.println("The dog says: bow wow");
	  }
	}

	public class SuperKeyword  {
	  public static void main(String[] args) {
	    Dog2 myDog = new Dog2();
	    myDog.animalSound();
	  }
	}
