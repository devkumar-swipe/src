import java.util.Scanner;
public class ifelse {

    public static void main(String[]args){
        System.out.println("check your number even or odd :");
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int var;
        var = sc.nextInt();

        
        int ram = var%2;

        
        if(ram == 0){
            System.out.println("yes it is even");
        }
        else{
            System.out.println("tu chutiya bhn ka lwda shi number dal bsdk ");
        }
sc.close();
        
    }
    
}
