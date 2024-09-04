//import java.lang.*;
import java.util.Scanner; 
public class student_Area {



    public static void main(String[]args){
        //now i am going to calculate the area of triangle and circle we need l b h c etc
        // System.out.println("area of triangle");
        // Scanner input = new Scanner(System.in);

        // float height = input.nextInt();
        // float base = input.nextInt();
        // float con = 1/2f;
        // float area = (con*height)*base;

        // System.out.println(area);
        // input.close();

        //now i am gong to create a program to calc a area of triangle 


        System.out.println("triangle area calculater ");
        
        float a,b,c;

        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        float s = (a+b+c)/2f;
        System.out.println(s);

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("the area is "+area);
        sc.close();

    }
    
}
