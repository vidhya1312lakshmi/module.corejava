import java.io.*;
import java.util.*;
class PRECEDENCE
{
public static void main(String args[])throws IOException
{
int a = 10;
int b = 5;
int c = 2;
System.out.println("a = 10" + "\t" + "b = 5" + "\t" + "c = 2");
int res1 = a + b * c;
System.out.println("a + b * c = " + res1);
System.out.println("The result is res1 because the multiplication has higher precedence than addition");
int res2 = (a + b) * c;
System.out.println("(a + b) * c = " + res2);
System.out.println("The result is res2 because the parenthesis has higher precedence than multiplication");
int res3 = a - b / c;
System.out.println("a - b / c = " + res3);
System.out.println("The result is res3 because the division has higher precedence than the subtraction");
}
}