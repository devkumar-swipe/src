import java.util.Scanner;
public class factorial {

    public static void main(String[]args){
        
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); 
       
        sc.close();
        System.out.println("factorial of "+k+"!");
        long fact =1;
        
            for(long i =1;i<=k;i++){
            fact=fact*i;        
        }
        System.out.println("your output is "+ fact +" ");
    }    
    
}
