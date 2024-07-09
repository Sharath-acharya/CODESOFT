import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numOfSub = scanner.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= numOfSub; i++) {
            System.out.println("Enter marks obtained in subject" + i + ":");
            int marks = scanner.nextInt();
            totalMarks += marks;

        }
        double AvgPercentage = (double) totalMarks / numOfSub;
        char grade;
        if (AvgPercentage >= 90) {
            grade = 'A';
        } else if (AvgPercentage >= 80) {
            grade = 'B';
        } else if (AvgPercentage >= 70) {
            grade = 'C';
        } else if (AvgPercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Total marks:" + totalMarks);
        System.out.println("Average Percantage :" + AvgPercentage + "%");
        System.out.println("Grade:" + grade);
        scanner.close();

    }
}
