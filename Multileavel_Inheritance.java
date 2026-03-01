package java_Project2;

	class Vehicle2 {
	    Vehicle2() {
	        System.out.println("This is a Vehicle");
	    }
	}
	class FourWheeler extends Vehicle2 {
	    FourWheeler() {
	        System.out.println("4 Wheeler Vehicles");
	    }
	}
	class Car1 extends FourWheeler {
	    Car1() {
	        System.out.println("This 4 Wheeler Vehicle is a Car");
	    }
	}
	public class Multileavel_Inheritance {
	    public static void main(String[] args) {
	        Car1 obj = new Car1(); // Triggers all constructors in order
	    }
	}
