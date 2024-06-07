/*
I'm lahar.I'm making this program to revise my skills in using arthmetic operators and taking input from the user.
ill be sharing the logic through comments for your UNDERSTANDING and for my REVISION
 */

import java.util.Scanner;
public class cbsepercentagecalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// creating scanner object to use while initianting input
        System.out.println("Welcome to CBSE BOARD PERCENTAGE CALCULATOR ☺");
        System.out.println("To calculate your board percentage please enter your marks: (chesedhi yemi ledu exam ayip0yindhi ipudu migilindhi resultey)" );
        System.out.println("English:");;//taking inputs
        float eng = input.nextInt();
        System.out.println("Maths:");
        float math = input.nextInt();
        System.out.println("Physics");
        float phy = input.nextInt();
        System.out.println("Chemistry");
        float chem = input.nextInt();
        System.out.println("Computer Science");
        float cs = input.nextInt();
        float sum = eng+math+phy+chem+cs;//obtaining total marks
        float div = sum/500;//we are calculating for 5 subjects sp divide by 500
        float percentage = div*100;//storing percentage
        System.out.println("You obtained:"+percentage+"%" );//giving output
        System.out.println("Thank you");}
}
