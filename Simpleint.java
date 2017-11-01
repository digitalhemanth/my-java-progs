import java.util.Scanner;
public class Simpleint
{
          public static void main(String args[])
          {
          int p,t,r;
          int si;
          Scanner s=new Scanner(System.in);
          System.out.println("Enter the ammount(p) : ");
          p=s.nextInt();
          System.out.println("Enter the rate (r) : ");
          r=s.nextInt();
          System.out.println("Enter the time (in yers) : ");
          t=s.nextInt();
          si=p*r*t/100;
          System.out.println("ther simple intrest is  :" +si );
          }
}
          


