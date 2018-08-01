import java.util.*;
class repeat
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=0;
        for(int i=1;i<=n;i++)
        {
            a=a+i;
        }
        System.out.print(a);
    }
}
