import java.util.*;
class prime
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int s=0;
        if(c<=1000){
        for(int i=2;i<c;i++)
        {
            if(c%i==0)
            {
                s++;
            }
        }
        if(s==0)
        {
            System.out.print("yes prime");
        }
        else
        System.out.print("not prime");
        s=0;
    }}
}
