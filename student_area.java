import java.util.Scanner;
public class student_area {


    public static void main (String[]args){

        float a , b,c;
        double r1,r2;

        Scanner sc = new Scanner(System.in);
        System.out.println("here is your expression ");
        a = sc.nextFloat();
        b= sc.nextFloat();
        c = sc.nextFloat();
        

        r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println("yor r1 is: "+r1);
        System.out.println("yor r2 is: "+r2);

        sc.close();







    }
    
}
