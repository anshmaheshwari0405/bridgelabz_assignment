import java.util.*;

public class Quest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        double average = (physics + chemistry + maths) / 3.0;
        String grade, remarks;

        if (average >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (average >= 75) {
            grade = "B";
            remarks = "Very Good";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Good";
        } else if (average >= 40) {
            grade = "D";
            remarks = "Needs Improvement";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.println("Average Mark: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}
