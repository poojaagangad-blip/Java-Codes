
//3.) Java program to find duplicate characters in a string


package Java_Project1;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Duplicate_CharIn_String
{

  public static void main(String[] args) {
    String str = ("Learn Java Programming");
    duplicateCountInStream(str.chars());
  }
  
  private static void duplicateCountInStream(IntStream stream){
    Map<Character, Long> countMap = stream.mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    countMap.entrySet().stream()
               .filter(es -> !es.getKey().equals(' ') && es.getValue() > 1)
               .forEach(es->{System.out.print("Character- " + es.getKey().toString() + " found ");

                   System.out.println(es.getValue() + " times");
                   });

  }
}
