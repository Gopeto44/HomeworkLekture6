import java.util.Scanner;

public class Task2 {
    public static void main (String args []){
//Напишете програма/ метод, която за подадени дължина и височина на правоъгълник, изкарват на конзолата неговият периметър и лице.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input Lenght of the rectangle");
        double lenghtOfRectangle = keyboard.nextDouble();
        System.out.println("Input Width of the rectangle");
        double widthOfRectangle = keyboard.nextDouble();
        double perimeter = (lenghtOfRectangle + widthOfRectangle) * 2;
        double area = lenghtOfRectangle * widthOfRectangle;
        System.out.println("Area of rectangle is : " + perimeter );
        System.out.print("Area of the rectangle is :" + area);


    }
}
