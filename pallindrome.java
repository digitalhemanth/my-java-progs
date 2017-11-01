import java.util.*;
class Palindrome 
{
    public static void main(String[] args)
    {
       String orgi,revr=" ";
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the string " );
       orgi=s.nextLine();
       
       int leng=orgi.length();
     
       for(int i=leng-1;i>=0;i--)
       {
           revr=revr+orgi.charAt(i);
        }
        
        if(orgi.equals(revr))
        System.out.println("pallindrome " );
        else
        System.out.println("Not pallindrome  " );
     }
}
