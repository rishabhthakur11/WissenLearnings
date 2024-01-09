import java.util.Scanner;

public class StudentMarksProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.print("Enter Standard: ");
        int std = scanner.nextInt();
        if(std<1 || std>10)
        {
            System.out.println("Invalid Standard");
            System.exit(0);
        }
        int numSubjects = 5;
        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            int mark = scanner.nextInt();
            if (mark < 0 || mark > 100) {
                System.out.println("Invalid marks entered for Subject " + (i + 1) + ". Marks should be between 0 and 100.");
                return;
            }
            marks[i] = mark;
        }
        double percentage = calculatePercentage(marks);
        System.out.println("Percentage: " + percentage + "%");
        // Check individual subject marks
            for (int i = 0; i < numSubjects; i++) {
                if (marks[i] < 35) {
                    System.out.println("Result : Failed (Marks below 35)");
                    return;
                }
            }
        if (percentage > 70) {
            System.out.println("Result: Distinction");
        }
        else if (percentage > 60) {
            System.out.println("Result: First Class");
        } else if (percentage > 35) {
            System.out.println("Result: Second Class");
        } else if (percentage < 35) {
            System.out.println("Result: Failed");
        }    
    }
    private static double calculatePercentage(int[] marks) {
        int totalMarks = 0;

        for (int mark : marks) {
            totalMarks += mark;
        }

        return (double) totalMarks / marks.length;
    }
}
