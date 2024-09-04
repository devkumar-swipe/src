import java.util.Scanner;
public class armstrong {
    public static void main(String[]args){

        System.out.println("here you will find a armstrong number or not !");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number to find: ");

        int num = sc.nextInt();
        sc.close();
        int m = num;
        int sum = 0;
        while(num>0)
        {
            int r = num%10;
            num = num/10;
            sum = sum + r * r * r;
            
            System.out.println(num);
        }
        
        if(m == sum){
            System.out.println("yes! it is an armstrong number  ");
        }
        else{
            System.out.println("nhi pta means ki nhi h  : ");
        }
        
        
    }
    
}
