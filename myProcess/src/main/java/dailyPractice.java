import java.util.Scanner;

public class dailyPractice {



    static void main()
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter first number");
        double  firstNumber= obj.nextDouble();

        System.out.println("Enter second number");
        double  secondNumber=obj.nextDouble();

        System.out.println("Sum ="+(firstNumber+secondNumber));
        System.out.println("Subtract ="+(firstNumber-secondNumber));
        System.out.println("Multiplication ="+(firstNumber*secondNumber));
        System.out.println("Divide ="+(float)(firstNumber/secondNumber));


    }
}
