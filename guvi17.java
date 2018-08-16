import java.util.*;
class amstrong
{
    public static void main(String arg[])
    {
        int c=0,q=0,su=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
         for(int i=0;n>0;i++)
         {
                q=n%10;
                su=su+(q*q*q);
                n=n/10;
         }
         if(su==m)
         System.out.print("amstrong");
         else
         System.out.print("Not a amstrong number");
    }
}
