public class MarksPercentage {
    public static void main(String[] args) {

        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;
        double weight = 72.0;
        double height = 1.8;

        int totalMarks = 78 + 84 + 69 + 91 + 88;

        double simpleInterest = principal * rate * time / 100.0;
        double totalAmount = principal + simpleInterest;

        double bmi = weight / (height * height);

        double percentage = totalMarks * 100.0 / 500;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
    }
}
