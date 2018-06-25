import java.io.*;
import java.util.*;
class NUM1
{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
     int i=sc.nextInt();
     if(i>=1&&i<=100000)
         System.out.print("positive number");
     else if(i==0)
     System.out.print("zero");
     else
     System.out.print("Negative number");
    }
}
