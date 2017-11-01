import java.util.Scanner;
class Sumofdigit
{
public static void main(String[] args) 
{
int a,no,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter any number: ");
no=s.nextInt();
while(no>0)
{
a=no%10;
no=no/10;
sum=sum+a;
}
System.out.println("Sum of Digits :"+sum);
}
}