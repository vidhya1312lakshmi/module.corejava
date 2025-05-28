import java.io.*;
import java.util.*;
class FACTORIAL
{
public static void main(String args[])throws IOException
{
int num;
DataInputStream k = new DataInputStream(System.in);
num = Integer.parseInt(k.readLine());
System.out.println("Factorial of "+num+" is : "+fact(num));
}
public static int fact(int num)
{
if(num == 0 || num == 1){
return 1;
}
else
return num * fact(num - 1);
}
}

