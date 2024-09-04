import java.util.Scanner;
public class regex {
    public static void main(String[]args){

    System.out.println("here we will perform regex ");
    
    Scanner sc = new Scanner(System.in);
    String ram = sc.nextLine();

    System.out.println(ram.matches("[a-z0-9]+"));





    // [.] it contain all nuber and character and alphabet
    //[a-z] it contains all a to z alba char
    //[0-9] it contains all numbers 
    // [^0-9] it contains not numeric 
    //[1-9a-z] it contains all alpha as well as char 
    
sc.close();




    }
    
}
