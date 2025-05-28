import java.io.*;
import java.util.*;
import java.util.Random;
class GAME
{
public static void main(String args[])throws IOException
{
int num;
Random random = new Random();
int n = random.nextInt(100) + 1;
DataInputStream k = new DataInputStream(System.in);
num = Integer.parseInt(k.readLine());
do{
if(num > n){
System.out.println("The guessed number is greater than the random number!! please try again...");
num = Integer.parseInt(k.readLine());
}
else if(num < n){
System.out.println("The guessed number is smaller than the random number!! please try again..");
num = Integer.parseInt(k.readLine());
}
else
{
System.out.println("The guessed number is same as the random number!!");
}
}while(num != n);
System.out.println("The guessed number is same as the random number!!");
}
}