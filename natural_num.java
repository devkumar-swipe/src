import java.util.Scanner;
public class natural_num {

    public static void main(String[]args){
        
        System.out.println("enter your last number");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); 
       
        sc.close();
        System.out.println("Sum of natural from 1 to "+k);
        int m =0;
        for(int i = 1;i<=k;i++){
            m=(k*(k+1))/2;
        }
        System.out.println("your sum is "+ m +" ");
    }
    
}
