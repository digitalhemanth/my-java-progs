import java.util.Scanner;
class Stuinfo
{
   void getdata()
   {
         Scanner s = new Scanner(System.in);
         System.out.println(" Please enter u r no :");
         int no = s.nextInt();
         System.out.println(" Please enter u r name :");
         String name = s.nextLine();
    }
    void display()
    {
          System.out.println(" hai" ); 
          System.out.println(" your number :" +no);
          System.out.println(" your name   :" +name );
     }
public static void main(String args[])
{
     Stuinfo m = new Stuinfo();
     m.getdata();
     m.display();
}
}

   