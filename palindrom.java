import java.util.Scanner;

public class palindrom {
     public static void main(String[]args){
        
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
       
        sc.close();
        System.out.println("your number is "+n+" and the digits are ");
        int r;
        int rev =0;
        int m = n;
    
        while (n>0) {
            r = n%10;
            rev=rev*10+r;
            n = n/10;
          
            System.out.println("your output is "+ r);
    
            
        }
        System.out.println("reverse number is "+rev);
        System.out.println("we know that reverse number == entered number is palandrom number");
        System.out.println();

        if (rev == m){
            System.out.println("number "+ rev +" is a palindrom number");
            System.out.println();
        }
        else{
            System.out.println("mai toh tut gya bhai mujhe nhi pta ");
            System.out.println("mere khayal se nhi h syd "); 
        }
    
}
}
