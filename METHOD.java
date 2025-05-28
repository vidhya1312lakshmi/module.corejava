import java.io.*;
import java.util.*;
class METHOD
{
public static void main(String args[])throws IOException
{
int a,b,c;
double d,e;
DataInputStream k = new DataInputStream(System.in);
System.out.println("Enter a value : ");
a = Integer.parseInt(k.readLine());
System.out.println("Enter b value : ");
b = Integer.parseInt(k.readLine());
System.out.println("Enter c value : ");
c = Integer.parseInt(k.readLine());
System.out.println("Enter d value : ");
d = Double.parseDouble(k.readLine());
System.out.println("Enter e value : ");
e = Double.parseDouble(k.readLine());
System.out.println("The sum of Two Integers : "+sum(a,b));
System.out.println("The sum of Three Integers : "+sum(a,b,c));
System.out.println("The sum of Two Double : "+sum(d,e));
}
public static int sum(int a, int b){
return a+b;
}
public static int sum(int a, int b, int c){
return a+b+c;
}
public static double sum(double d, double e){
return d+e;
}
}