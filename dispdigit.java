import java.util.Scanner;
public class dispdigit {
    public static void main(String[]args){
        
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
       
        sc.close();
        System.out.println("your number is "+n+" and the digits are ");
        int r;
    
        while (n>0) {
            r = n%10;
            n = n/10;
          
            System.out.println("your output is "+ r);
    
            
        }
        
        
    }
}
    

