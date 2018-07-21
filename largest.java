import java.util.*;
class largest
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print(a[a.length-1]);
    }
}
