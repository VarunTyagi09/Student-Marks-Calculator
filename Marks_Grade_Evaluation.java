package Projects_Java;
import java.util.Scanner;

public class Marks_Grade_Evaluation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String studentName = input.nextLine();

        System.out.print("Enter Roll Number: ");
        int RollNo = input.nextInt();

        float grade;


        while (true) {
            System.out.print("Enter Marks (0-100): ");
            grade = input.nextFloat();

            if (grade >= 0 && grade <= 100) {
                break;
            } else {
                System.out.println(" Invalid marks! Please enter again.");
            }
        }
        if (grade >= 90) {
            System.out.println("A+");
        } else if (grade >= 80) {
            System.out.println("A");
        } else if (grade >= 70) {
            System.out.println("B+");
        } else if (grade >= 60) {
            System.out.println("B");
        } else if (grade >= 50) {
            System.out.println("C");
        } else if (grade >= 45) {
            System.out.println("D");
        } else if (grade >= 40) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }

        System.out.println(studentName + " scored " + grade + " marks and secured grade ".");


        input.close();
    }
}