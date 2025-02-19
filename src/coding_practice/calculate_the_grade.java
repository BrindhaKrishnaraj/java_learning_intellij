package coding_practice;

import java.util.Scanner;

public class calculate_the_grade {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in); --> scanner class
        //System.out.println("Enter the score");
        //int score= sc.nextInt();
        //int score=65;
        int score = Integer.parseInt(args[0]);//command line argument
        char grade;
        if (score>=90 && score<=100){
            grade='A';
        }
        else if (score>=80 && score<=89){
            grade='B';
        }
        else if (score>=70 && score<=79){
            grade='C';
        }
        else if (score>=60 && score<=69){
            grade='D';
        }
        else if (score<0 || score>100){
            grade='O';
        }
        else {
            grade='F';
        }
        System.out.println("your grade is " + grade);
    }
}
