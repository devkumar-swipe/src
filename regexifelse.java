import java.util.Scanner;
public class regexifelse {

    public static void main(String[]args){
    
    System.out.println("check the number is decimal octal hexadecimal");


    Scanner sc = new Scanner(System.in);
    
    String num = sc.nextLine();

    if (num.matches("[01]+")){
        System.out.println("binary redex");

    }
    else if(num.matches("[0-7]+")){
        System.out.println("octal redex");

    }
    else if(num.matches("[0-7]+")){
        System.out.println("octal redex");

    }
    else if (num.matches("[0-9a-f]+")){
        System.out.println("hexa decimal redex");
    }
    else{
        System.out.println("invalid number");
    }
    sc.close();
    


    }
    
}
