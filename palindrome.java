import java.util.*;
class repeat
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String w="";
        if(s.length()<=1000)
        for(int i=s.length()-1;i>=0;i--)
        {
            w=w+s.charAt(i);
        }
        if(s.equals(w))
        {
            System.out.print("yes");
        }
        else
        System.out.print("no");
    }
}
