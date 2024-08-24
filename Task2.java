//   TASK 2...

import java.util.*;
public class Task2 {
    public static void Gradecalculator(){
        int Total_marks = 0;
        float Percentage;
        String grade;

//        Scanner class.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int size = sc.nextInt();
        System.out.println("Enter the marks obtained out of 100 in each subject:");
        int marks [] = new int[size];
        for (int i=0; i<size; i++){
            marks[i] = sc.nextInt();
        }

//        Total marks.

        for (int i=0; i< marks.length; i++){
            Total_marks = Total_marks + marks[i];


        }
        System.out.println("Total Marks Obtained: "+ Total_marks);


//        Percentage calculation.

        Percentage = (Total_marks/size);
        System.out.println("Percentage Obtained: " + Percentage +"%");

//        grade calculation.
        if (Percentage>=90){
            grade = "A";
            System.out.println("Grade Obtained: "+ grade );
        } else if (Percentage>=80) {
            grade = "B";
            System.out.println("Grade Obtained: "+ grade);

        } else if (Percentage>=70) {
            grade = "C";
            System.out.println("Grade Obtained: "+ grade);

        } else if (Percentage>=60) {
            grade = "D";
            System.out.println("Grade Obtained: "+ grade);

        } else if (Percentage>=50) {
            grade = "E";
            System.out.println("Grade Obtained: "+ grade);

        } else if (Percentage>=40) {
            grade = "F";
            System.out.println("Grade Obtained: "+ grade);

        } else if (Percentage<40) {
            System.out.println("You are failed.");

        }


    }
    public static void main(String [] args){
        Gradecalculator();
    }
}




