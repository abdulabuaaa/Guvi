import java.util.*;
class prime
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int s=0;
        if((c<=100000)&&(n<=100000)){
        for(int i=n;i<c;i++)
        {
            if(i%2==0)
            {
                s++;
            }
        if(s==0)
        {
            System.out.print(i+" ");
        }
        s=0;
        }
    }}
}
