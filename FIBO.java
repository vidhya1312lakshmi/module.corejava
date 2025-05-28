import java.io.*;
import java.util.*;
class FIBO
{
public static void main(String args[])throws IOException
{
int num,result=0;
DataInputStream k = new DataInputStream(System.in);
System.out.println("Enter a number to find the Fibonacci series result : ");
num = Integer.parseInt(k.readLine());
while(num > 0){
result = result + num;
num--;
}
System.out.println("The Fibonacci Series result is : "+result);
}
}