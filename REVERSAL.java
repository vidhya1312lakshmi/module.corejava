import java.io.*;
import java.util.*;
class REVERSAL
{
public static void main(String args[])throws IOException
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the string to be reversed : ");
String OriginalString = scanner.nextLine(); 
StringBuilder temp = new StringBuilder(OriginalString);
temp.reverse();
String ReversedString = temp.toString();
System.out.println("Original String is : "+ OriginalString);
System.out.println("Reversed String is : "+ ReversedString);
scanner.close();
}
} 