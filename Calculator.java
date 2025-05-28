import java.io.*;
import java.util.*;
class Calculator
{
public static void main(String args[])throws IOException
{
int a,b,c;
DataInputStream k = new DataInputStream(System.in);
System.out.println("Enter the First value:");
a = Integer.parseInt(k.readLine());
System.out.println("Enter the Second value:");
b = Integer.parseInt(k.readLine());
System.out.println("ADDITION OF TWO NUMBERS:");
c = a + b;
System.out.println("Sum is : " + c);
System.out.println("SUBTRACTION OF TWO NUMBERS");
c = a - b;
System.out.println("Difference is : " + c);
System.out.println("MULTIPLICATION OF TWO NUMBERS");
c = a * b;
System.out.println("Product is : " + c);
System.out.println("DIVISION OF TWO NUMBERS");
c = a / b;
System.out.println("Quotient is : " + c);
}
}
