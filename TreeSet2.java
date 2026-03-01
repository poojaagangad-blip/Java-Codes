package java_Project2;
import java.util.TreeSet;
public class TreeSet2 {
  public static void main(String[] args) {
    TreeSet<Integer> numbers = new TreeSet<>();
    numbers.add(40);
    numbers.add(10);
    numbers.add(30);
    numbers.add(20);

    for (int n : numbers) {
      System.out.println(n);
    }
  }
}
