import java.util.*;
class alphabet
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
            if((a>=65 && a<=91)||(a>=97 && a<=122))
            {
                System.out.print("Alphabet");
            }
            else
            {
                System.out.print("No");
            }
    }
}
