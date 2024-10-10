import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input the total number of students in the class
        System.out.print("Enter the total number of students: ");
        int totalStudents = scanner.nextInt();

        // Initialize counters for present and absent students
        int presentCount = 0;
        int absentCount = 0;

        // Loop through each student to take attendance
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Is student " + i + " present? (Y/N): ");
            char attendance = scanner.next().charAt(0);

            // Check if the student is present or absent
            if (attendance == 'Y' || attendance == 'y') {
                presentCount++;
            } else if (attendance == 'N' || attendance == 'n') {
                absentCount++;
            } else {
                System.out.println("Invalid input, please enter Y for present or N for absent.");
                i--; // repeat for the same student due to invalid input
            }
        }

        // Display the final counts
        System.out.println("Total present: " + presentCount);
        System.out.println("Total absent: " + absentCount);

        // Close the scanner
        scanner.close();
    }
}
