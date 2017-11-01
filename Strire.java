import java.io.*;
import java.util.*;

public class Strire {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string ");
        String A=sc.next();
        String R = new StringBuilder(A).reverse().toString();
        System.out.println(" Reversed string is :" );
        System.out.println( R );
        
        if(A.equals(R))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}