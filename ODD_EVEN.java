import java.io.*;
import java.util.*;
class ODD_EVEN
{
public static void main(String args[])throws IOException
{
int n;
DataInputStream k = new DataInputStream(System.in);
System.out.println("Enter the number to check whether if the entered number is odd or even : ");
n = Integer.parseInt(k.readLine());
if(n%2==0){
System.out.println("The entered number is Even");
}
else
System.out.println("The entered number is Odd");
}
}

