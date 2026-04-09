import java.util.Scanner;

public class dailyPractice {



    static void main()
    {
 /*
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter first number");
        double  firstNumber= obj.nextDouble();

        System.out.println("Enter second number");
        double  secondNumber=obj.nextDouble();

        System.out.println("Sum ="+(firstNumber+secondNumber));
        System.out.println("Subtract ="+(firstNumber-secondNumber));
        System.out.println("Multiplication ="+(firstNumber*secondNumber));
        System.out.println("Divide ="+(float)(firstNumber/secondNumber));
*/

//2nd problem
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter random number");
        double num= obj.nextDouble();

        if (num==0)
        {
            System.out.println("Zero");
        } else if (num>0) {

            System.out.println("number is Positive");
        }

        else
        {
            System.out.println("number is Negative");
        }


    }
}
