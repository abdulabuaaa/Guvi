import java.util.*;
class vowels
{
    public static void main(String arg[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int c=0;
        for(i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
	            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'
	            ||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
	            {
	               c++;
	            }
        }
        if(c>0)
        {
            System.out.print("vowels");
        }
	            else
	            {
	                System.out.print("Consonant");
	            }
   }
    
}

