import java.util.Scanner;
class EvenOdd
{
        public static void main(String[] args) 
        {
             int n;
             Scanner s=new Scanner(System.in);
             System.out.println("Enter number to find out the num is even or odd: ");
             n=s.nextInt();
             if(n%2==0)
             {
                 System.out.println("this is even num"); 
             } 
             else
             {
                System.out.println("this is odd num");
             }
        }
}
