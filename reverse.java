import java.util.Scanner;

public class reverse {
     public static void main(String[]args){
        
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
       
        sc.close();
        System.out.println("your number is "+n+" and the digits are ");
        int r;
        int rev =0;
    
        while (n>0) {
            r = n%10;
            rev=rev*10+r;
            n = n/10;
          
            System.out.println("your output is "+ r);
    
            
        }
        System.out.println(rev);

        
        
    }
    
}
