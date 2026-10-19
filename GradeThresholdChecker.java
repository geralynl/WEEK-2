public class GradeThresholdChecker {
    public static void main(String[] args) {
        double averageGrade = 85;
        int absences = 2;

        boolean passed = (averageGrade >= 75 && absences <= 3)
                         || averageGrade >= 90;
            System.out.println("Average Grade: " + averageGrade);
        System.out.println("Absences: " + absences);

        if (passed) {
            System.out.println("Result: PASS");
            System.out.println("Reason: You meet the passing requirements.");
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: You did not meet the passing requirements.");
        }
    }
}
