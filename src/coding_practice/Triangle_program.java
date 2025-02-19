package coding_practice;

import java.util.Scanner;

public class Triangle_program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st side");
        int side1= sc.nextInt();
        System.out.println("Enter the 2nd side");
        int side2= sc.nextInt();
        System.out.println("Enter the 3rd side");
        int side3= sc.nextInt();
        if(side1<=0 && side2<=0 && side3<=0){
            System.out.println("Enter the sides in positive number");
        }
        else{
            if (side1==side2 && side1==side3 && side2==side3){
                System.out.println("Eqilateral triangle");
            } else if (side1==side2 || side1==side3 || side2==side3) {
                System.out.println("Isoceles triangle");
            }
            else {
                System.out.println("Scalene triangle");
            }
            sc.close();
        }
    }
}
