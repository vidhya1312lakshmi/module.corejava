import java.io.*;
import java.util.*;

class SA {
public static void main(String args[]) throws IOException {
int num;
BufferedReader k = new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("Enter the number of elements to be added in the array : ");
num = Integer.parseInt(k.readLine());
double[] result = sumAndAverage(num, k);
System.out.println("The sum of the elements in the array is : " + (int)result[0]); 
System.out.println("The average of the elements in the array is : " + result[1]);
}
public static double[] sumAndAverage(int num, BufferedReader k) throws IOException {
int arr[] = new int[num]; 
int res = 0;
for (int i = 0; i < num; i++) {  
System.out.println("Enter the " + (i + 1) + " element : "); 
int val = Integer.parseInt(k.readLine());
arr[i] = val;
res = res + arr[i];
}
double average = (double) res / num; 
return new double[]{res, average}; 
}
}