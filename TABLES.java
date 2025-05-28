import java.io.*;
import java.util.*;
class TABLES
{
public static void main(String args[])throws IOException
{
int n,res;
System.out.println("Enter the number for which the multiplication table has to be developed:");
DataInputStream k = new DataInputStream(System.in);
n = Integer.parseInt(k.readLine());
for(int i = 1; i <= 10; i++){
res = i * n;
System.out.println(i + " * " + n + " = " + res);
}
}
}