// Console - Based - Calculator

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean calculation=true;

        while(calculation){
            try{
                System.out.print("Enter the first number: ");
                double num1=sc.nextDouble();

                System.out.print("Enter the next number: ");
                double num2=sc.nextDouble();

                System.out.print("Enter the operation you have to perform +,-,*,/: ");
                char op=sc.next().charAt(0);

                double result;

                switch(op){
                    case '+':
                    result=num1+num2;
                    break;

                    case '-':
                    result=num1-num2;
                    break;

                    case '*':
                    result=num1*num2;
                    break;

                    case '/':
                    if(num2==0){
                        System.out.println("Error: Division By Zero!");
                        continue;
                    }
                    result=num1/num2;
                    break;

                    default:
                    System.out.println("Invalid operator!");
                    continue;
                }

                System.out.println("Result: "+result);
                
            }

            catch(InputMismatchException e){
                System.out.println("Invalid Input");
                sc.next();
            }

            System.out.print("Do you want to continue? y/n");
            String choice=sc.next();
            if(!choice.equals("y")){
                calculation=false;
            }
        }
        System.out.println("Exit");
        sc.close();
    }
}
