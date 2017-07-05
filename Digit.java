# digit
import java.io.*;
import java.util.*;
import java.lang.*;
public class Digit;
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,count= 0;
    n=sc.nextInt();  
    while(n != 0)
    {
      // n = n/10
      n /= 10;
      ++count;
    }
    System.out.println("Number of digits: "+ count);
  }
}  
