import java.util.*;
import java.lang.*;
class repeat
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),q=1;
        int s=sc.nextInt();
        while(s!=0)
        {
            q=q*n;
            s--;
        }
        System.out.print(q);
    }
}
