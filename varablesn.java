import java.util.Scanner;

public class varablesn {
    public static void main(String[] args){
        int ram = 10;
        int mohan = 30;
        double radha , mohanha;
        radha = 59;
        mohanha = 34.9;

        System.out.println(ram + mohan);
        System.out.println(radha+mohanha);


        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("enter your number");
        age = input.nextInt();
        System.out.println("your age is " + age);

        input.nextLine();

        String name;
        System.out.println("enter your name ");
        name = input.nextLine();
        System.out.println("name is "+ name);
        input.close();



    }
    
}
