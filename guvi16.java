import java.util.*;
class evennumbersbetweentwonumbers
{
    public static void main(String arg[])
    {
        int c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        for(int i=n+1;i<m;i++)
        {
           for(int j=1;j<=i;j++)
            { 
                if(i%j==0)
                {
                   c++;
                }
            }
            if(c==2)
            {
                System.out.print(i+" ");
            }
            c=0;
        }
    }
}

