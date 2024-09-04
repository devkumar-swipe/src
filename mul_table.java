import java.util.Scanner;
public class mul_table {
    public static void main(String[]args){
        int i ;
        System.out.println("enter your table number");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt(); 
        sc.close();
        System.out.println("table of "+j);

        for(i = 1 ;i<=10;i++){
            System.out.println(j+" * "+i+" = "+i*j);

        }

        
    }
    
}
