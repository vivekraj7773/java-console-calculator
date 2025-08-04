import java.util.Scanner;

public class Calculator {

    public static double add(double a,double b) {
        return a+b;
    }

    public static double subtract(double a,double b) {
        return a-b;
    }

    public static double multiply(double a,double b) {
        return a*b;
    }

    public static double divide(double a,double b) {
        if(b==0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a/b;
    } 

public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    boolean continueCalc = true;

    while(continueCalc) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter operator(+,-,*,/): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch(operator) {
            case '+':result=add(num1,num2);
            break;

            case '-':result=subtract(num1,num2);
            break;

            case '*':result=multiply(num1,num2);
            break;

            case '/':result=divide(num1,num2);
            break;

            default:
            System.out.println("Invalid Operator.");
        }
      
        System.out.println("Result:"+result);
        System.out.println("Do you want to continue?(yes/no):");

           String answer = scanner.next();
           
           if(!answer.equalsIgnoreCase("yes")) {
                 continueCalc=false;
          }
    }
    scanner.close();
  }
}