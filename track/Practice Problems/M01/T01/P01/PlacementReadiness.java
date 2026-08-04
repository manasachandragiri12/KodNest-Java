public class PlacementReadiness {
    public static void main(String[] args) {

        int marks = 72;
        int attendance = 80;
        boolean projectCompleted = true;
        int mockInterviewScore = 78;

        boolean marksEligible = marks >= 60;
        boolean attendanceEligible = attendance >= 75;
        boolean academicEligible = marksEligible && attendanceEligible;

        if (academicEligible) {
            if (!projectCompleted) {
                System.out.println("Complete the Project");
            } else if (mockInterviewScore < 70) {
                System.out.println("Improve Interview Skills");
            } else {
                System.out.println("Placement Ready");
            }
        } else {
            System.out.println("Improve Academic Eligibility");
        }
    }
}
