import java.util.Scanner;

class OrderCalculator {

    int calculateSubtotal(int price, int quantity) {
        return price * quantity;
    }

    int calculateFinalTotal(int subtotal, int deliveryCharge) {
        return subtotal + deliveryCharge;
    }
}

public class FoodOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        int deliveryCharge = scanner.nextInt();

        OrderCalculator r = new OrderCalculator();

        int subtotal = r.calculateSubtotal(price, quantity);

        int finalTotal = r.calculateFinalTotal(subtotal, deliveryCharge);

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Final Total: " + finalTotal);

        scanner.close();
    }
}