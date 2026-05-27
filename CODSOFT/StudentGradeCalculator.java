import java.util.Scanner;

class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfSubjects;
        int totalMarks = 0;
        double averagePercentage;
        String grade;


        System.out.print("Enter Number of Subjects: ");
        numberOfSubjects = sc.nextInt();


        int[] marks = new int[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {

            System.out.print("Enter Marks for Subject " + (i + 1) + " : ");
            marks[i] = sc.nextInt();

            totalMarks = totalMarks + marks[i];
        }


        averagePercentage = (double) totalMarks / numberOfSubjects;


        if (averagePercentage >= 90) {
            grade = "A+";
        }
        else if (averagePercentage >= 80) {
            grade = "A";
        }
        else if (averagePercentage >= 70) {
            grade = "B";
        }
        else if (averagePercentage >= 60) {
            grade = "C";
        }
        else if (averagePercentage >= 50) {
            grade = "D";
        }
        else {
            grade = "Fail";
        }


        System.out.println("\n RESULT ");
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Average Percentage : " + averagePercentage + "%");
        System.out.println("Grade : " + grade);

        sc.close();
    }
}
