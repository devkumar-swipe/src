import java.util.Scanner;

public class count_digits {
    public static void main(String[]args){
        
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
       
        sc.close();
        System.out.println("your number is "+n+" and total digits are ? ");
        int count= 0;
    
        while (n>0) {
            n = n/10;
            count++;
              
        }
        System.out.println("your digits are "+ count);
        
        
    }
    
}
