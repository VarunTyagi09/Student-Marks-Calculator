package Projects_Java;
import java.util.Scanner;

public class Marks_Grade_Evaluation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String studentName = input.nextLine();

        System.out.print("Enter Roll Number: ");
        int RollNo = input.nextInt();

        System.out.print("Enter Your Grades: ");
        while (true) {
            float Grade = input.nextFloat();
            if (Grade >= 0 && Grade <= 100) break;
            System.out.print(" Invalid! Enter Correct marks again (0-100): ");

            {
                Scanner Grades = new Scanner(System.in);
                float Grades = input.nextFloat();

                if (Grade >= 90 && Grade <= 100) {
                    System.out.print("Your Grades: A+");


                } else if (Grade >= 80 && Grade <= 89) {
                    System.out.print("Your Grades: A ");
                }
            }
        }
    }
}