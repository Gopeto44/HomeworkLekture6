import java.util.Scanner;

public class Task3 {
    public static void main (String args []){
        //Напишете програма/ метод, която чете число(или се приема като параметър на метод) и изписва в конзолата дали числото е четно или не?
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input number");
        int number = keyboard.nextInt();
        if ((number % 2) == 0) {
            System.out.println("Number is even");
        }else {
            System.out.println("Number is uneven");
        }
    }
}
