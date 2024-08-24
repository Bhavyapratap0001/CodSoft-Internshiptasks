//   TASK 1...

import java.util.*;
public class Task1 {
    public static void NumberGuessing(){
//        Scanner class.
        Scanner sc = new Scanner(System.in);

//        Generate the number.
        Random ran = new Random();
        int Number = ran.nextInt(100);

        //       trials.
        int Trials = 5;

        System.out.println("A number is generated between 1 to 100. Guess the number within 5 trials.");

        for (int i=0; i<=Trials; i++ ){

            System.out.println("Guess the number:");

            int guess = sc.nextInt();

            if (Number==guess){
                System.out.println("You guessed the correct number.");
                break;

            } else if (Number<guess) {
                System.out.println("The number is smaller than"+ guess);


            } else if (Number>guess){
                System.out.println("The number is greater than"+ guess);

            }
            if (i==Trials){
                System.out.println("You exhausted your trials.");
                System.out.println("The number is:"+Number);
            }
        }

    }
    public static void main(String [] args){
        NumberGuessing();
    }
}