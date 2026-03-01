//A TreeSet is a collection that stores unique elements in sorted order.
package java_Project2;
import java.util.TreeSet;
public class TrresetEx {
  public static void main(String[] args) {
    TreeSet<String> cars = new TreeSet<>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");  // Duplicate
    cars.add("Mazda");

    System.out.println(cars);
  }
}