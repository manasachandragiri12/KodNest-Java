public class PlacementReadiness {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;
        boolean isReady = (marks >= 60) && (attendance >= 75);
        String message = isReady ? "Placement Ready" : "Continue Preparation";
        System.out.println(message);

        for (i = 1; i <= practiceDays; i++) {
            System.out.println("Practice Day: " + i);
        }
    }
}