import java.util.Scanner;

public class menudiven {

    public static void main(String[] args) {
        System.out.println("Personal Calculator 🌐:");
        System.out.println("Please choose what you want to perform");
        System.out.println("Press 1 for addition + :");
        System.out.println("Press 2 for subtraction - :");
        System.out.println("Press 3 for multiplication x :");
        System.out.println("Press 4 for division / :");
        System.out.println("Press 5 for percentage :");

        Scanner sc = new Scanner(System.in);
        int choices = sc.nextInt();

        System.out.println("Enter the first number:");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number:");
        float num2 = sc.nextFloat();

        float result = 0;

        switch (choices) {
            case 1:
                result = num1 + num2;
                System.out.println("Your result is: " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Your result is: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Your result is: " + result);
                break;

            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Your result is: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            case 5:
                System.out.println("enter total number");
                float num3 = sc.nextFloat();

                result = (num1 + num2)/num3 * 100;
                System.out.println("Your result is: " + result + "%");
                break;

            default:
                System.out.println("Invalid choice, please try again.");
                break;
        }

        sc.close();
    }
}
