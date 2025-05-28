import java.io.*;
import java.util.*;
class LEAP_YEAR
{
public static void main(String args[])throws IOException
{
int y;
System.out.println("Enter the year to be checked whether the entered year is leap year or not : ");
DataInputStream k = new DataInputStream(System.in);
y = Integer.parseInt(k.readLine());
if((y%4==0 && y%100!=0)||(y%400==0)){
System.out.println("The entered year "+ y +" is a Leap Year!!");
}
else
System.out.println("The entered year is not a Leap Year!!");
}
}
