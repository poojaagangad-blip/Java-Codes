package java_Project2;
import java.util.*;
public class Vowels_Consonants {
 public static void count(String str) 
 {
int vow = 0, con = 0;
String ref = "aeiouAEIOU";

for (int i = 0; i < str.length(); i++) {
    
    // Check for any special characters present 
    // in the given string
    if ((str.charAt(i) >= 'A'
         && str.charAt(i) <= 'Z')
        || (str.charAt(i) >= 'a'
            && str.charAt(i) <= 'z')) {
        if (ref.indexOf(str.charAt(i)) != -1)
            vow++;
        else
            con++;
    }
}

 
System.out.println("Number of Vowels = " + vow  + "\nNumber of Consonants = "  + con);
}


public static void main(String[] args)
{

String str = "#GeeksforGeeks";

count(str);
}
}