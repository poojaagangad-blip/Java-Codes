
//Java program to find if a string is Palindrome

package java_Project2;
public class Palindrome_String {
public static void main(String[] args) {
String str = "madam";
System.out.println(isPalindrome(str));
}
static boolean isPalindrome(String str) {
int start = 0;
int end = str.length() - 1;
while (start < end) {
if (str.charAt(start) != str.charAt(end)) {
return false;
}
start++;
end--;
}
return true;
}
}