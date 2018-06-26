import java.util.*;
class odd
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1&&n<=10000)
        {
        if(n%2==0)
        {
            System.out.print("even");
        }
        else if(n%2!=0)
        System.out.print("odd");
        }
        else 
        System.out.print("invalid");
    }
}
