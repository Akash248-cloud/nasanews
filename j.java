import java.util.Scanner;

public class j {
    public static void main(String[] args) {
        System.out.println("Addition the two numbers\n");
        int num1, num2,sum;
        Scanner sc = new Scanner(System.in);
        {
         System.out.println("Enter a first number:");
        num1=sc.nextInt(10);
         System.out.println("Enter a second number:");
        num2=sc.nextInt(10);
        sum=num1+num2;
        System.out.println("The total number is :"  +sum);

        }
    }
}
