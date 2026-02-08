package Projects_Java;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Student Management System");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your Roll No: ");
        int roll = input.nextInt();

        float eng, math, phy, chem, bio;

        // English
        System.out.print("Enter English marks: ");
        while (true) {
            eng = input.nextFloat();
            if (eng >= 0 && eng <= 100) break;
            System.out.print(" Invalid! Enter English marks again (0-100): ");
        }

        // Maths
        System.out.print("Enter Maths marks: ");
        while (true) {
            math = input.nextFloat();
            if (math >= 0 && math <= 100) break;
            System.out.print(" Invalid! Enter Maths marks again (0-100): ");
        }

        // Physics
        System.out.print("Enter Physics marks: ");
        while (true) {
            phy = input.nextFloat();
            if (phy >= 0 && phy <= 100) break;
            System.out.print(" Invalid! Enter Physics marks again (0-100): ");
        }

        // Chemistry
        System.out.print("Enter Chemistry marks: ");
        while (true) {
            chem = input.nextFloat();
            if (chem >= 0 && chem <= 100) break;
            System.out.print(" Invalid! Enter Chemistry marks again (0-100): ");
        }

        // Biology
        System.out.print("Enter Biology marks: ");
        while (true) {
            bio = input.nextFloat();
            if (bio >= 0 && bio <= 100) break;
            System.out.print(" Invalid! Enter Biology marks again (0-100): ");
        }

        float totalMarks = eng + math + phy + chem + bio;
        float percentage = (totalMarks / 500f) * 100;

        System.out.println("\n--- STUDENT DETAILS ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Percentage: " + percentage + "%");

        input.close();
    }
}