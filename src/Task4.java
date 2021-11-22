import java.util.Scanner;

public class Task4 {
    public static void main (String args []){
        //Напишете програма/ метод, която чете число от 1 до 7 в конзолата (или се приема като параметър на метод)
        // и на базата на това изписва в конзолата деня от седмицата във формат:
        //You have selected 1. Day of the week is Monday.
        Scanner keybord = new Scanner(System.in);
        System.out.println("Enter number");
        int dayOfTheWeek = keybord.nextInt();
        if (dayOfTheWeek == 1 ){
            System.out.println("You have selected 1. Day of the week is Monday.");
        }else
            if(dayOfTheWeek == 2 ){
                System.out.println("You have selected 2. Day of the week is Tuesday.");
            }else
                 if (dayOfTheWeek == 3){
                System.out.println("You have selected 3. Day of the week is Wednesday.");
                 }else
                      if(dayOfTheWeek == 4){
                          System.out.println("You have selected 4. Day of the week is Thursday.");
                      }else
                          if (dayOfTheWeek == 5){
                              System.out.println("You have selected 5. Day of the week is Friday.");
                          }else
                              if(dayOfTheWeek == 6){
                                  System.out.println("You have selected 6. Day of the week is Saturday.");
                              }else
                                  if (dayOfTheWeek==7 ){
                                      System.out.println("You have selected 7. Day of the week is Sunday.");
                                  }else
                                      if (dayOfTheWeek > 7 ){
                                          System.out.println("There is no such day");
                                      }



    }
}
