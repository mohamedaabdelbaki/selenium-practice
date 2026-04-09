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

/*
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
*/

 //Problem 3 — Loops + Condition
/*
        Scanner obj=new Scanner(System.in);
        System.out.println("enter 5 numbers");

        double[] numbers=new double[5];
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;


        for(int i=0 ;i<=numbers.length-1;i++)
        {
            System.out.println("Enter "+(i+1)+" number");
            numbers[i]=obj.nextDouble();


            if(numbers[i]>0)
            {
                positiveCount+=1;

            } else if (numbers[i]<0)
            {
                negativeCount+=1;
            }
            else
            {
                zeroCount+=1;

            }
        }

        System.out.println("number of element in the array "+numbers.length);
        System.out.println("count of Positive number "+positiveCount);
        System.out.println("count of Negative number"+negativeCount);
        System.out.println("count of zeros in array"+zeroCount);


*/
    }
}
