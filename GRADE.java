import java.io.*;
import java.util.*;
class GRADE
{
public static void main(String args[])throws IOException
{
int marks;
DataInputStream k = new DataInputStream(System.in);
System.out.println("Enter the Marks Scored out of 100 : ");
marks = Integer.parseInt(k.readLine());
if(marks >= 90 && marks <= 100)
{
System.out.println("Your Mark is " + marks+ " and Your Grade is 'A'");
}
else if(marks >= 80 && marks <= 89)
{
System.out.println("Your Mark is " + marks+ " and Your Grade is 'B'");
}
else if(marks >= 70 && marks <= 79)
{
System.out.println("Your Mark is " + marks+ " and Your Grade is 'C'");
}
else if(marks >= 60 && marks <= 69)
{
System.out.println("Your Mark is " + marks+ " and Your Grade is 'D'");
}
else
{
System.out.println("Your Mark is " + marks+ " and Your Grade is 'F'");
}
}
}