package java_Project2;

class Animal4 {
	  public void makeSound() {
	    System.out.println("Animal sound");
	  }
	}

	public class Anonymous {
	  public static void main(String[] args) {
	    // Anonymous class that overrides makeSound()
	    Animal4 myAnimal = new Animal4() {
	      public void makeSound() {
	        System.out.println("Woof woof");
	      }
	    };

	    myAnimal.makeSound();
	  }
	}