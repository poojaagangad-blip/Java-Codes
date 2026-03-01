package java_Project2;

import java.time.LocalDateTime; // import the LocalDateTime class

public class Current_DateTime {
  public static void main(String[] args) {
    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);
  }
}