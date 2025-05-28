import java.io.*;
import java.util.*;
class PALINDROME
{
public static void main(String args[])throws IOException
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the string to checked : ");
String string = scanner.nextLine();
System.out.println("The entered string " + string + " is palindrome ? " + isPalindrome(string));
}
public static Boolean isPalindrome(String string)
{
if(string == null || string.isEmpty()){
return true;
}
StringBuilder temp = new StringBuilder();
for(char c : string.toCharArray()){
if(Character.isLetterOrDigit(c)){
temp.append(Character.toLowerCase(c));
}
}
String str = temp.toString();
int left=0;
int right = str.length() - 1;
while(left < right){
if(str.charAt(left) != str.charAt(right)){
return false;
}
left++;
right--;
}
return true;
}
}