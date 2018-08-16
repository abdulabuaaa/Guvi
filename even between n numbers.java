import java.util.*;
class evennumbersbetweentwonumbers
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        for(int i=n+1;i<m;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
