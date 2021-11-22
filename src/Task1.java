import java.util.Scanner;

public class Task1 {
    public static void main (String args []){
//Напишете програма/ метод, която приема 3 подадени числа определя кое е най-голямата.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input First number");
        double firstNumber = keyboard.nextDouble();
        System.out.println("Input second number");
        double secondNumber = keyboard.nextDouble();
        System.out.println("Input Third number");
        double thirdNumber = keyboard.nextDouble();
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("First number is biggest");
        } else
           if (secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("Second number is biggest");
        } else
            if (thirdNumber > firstNumber && thirdNumber > secondNumber){
                System.out.println("Third number is biggest");
            }else
                if ((firstNumber == secondNumber) && (firstNumber > thirdNumber)){
                    System.out.println("First two numbers are bigger the the third");
                }else
                    if ((secondNumber ==thirdNumber) && (secondNumber > firstNumber)){
                        System.out.println("Second two numbers are bigger then the First");
                    }else
                        if ((firstNumber == thirdNumber) && (firstNumber > secondNumber)){
                            System.out.println("First and Third numbers are bigger then the Second");
                        }else
                            if((firstNumber == secondNumber)&&( secondNumber == thirdNumber)){
                                System.out.println("They are equal");
                            }


    }
}
