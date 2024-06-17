package FooCorporation;

public class FooCorporation {
    public static void calculatePay(double basePay, int hoursWorked) {
        double totalPay;

        if (basePay < 8.0) {
            System.out.println("Error: Base pay is less than $8.00.");
            return;
        }

        if (hoursWorked > 60) {
            System.out.println("Error: Hours worked exceed 60.");
            return;
        }

        if (hoursWorked <= 40) {
            totalPay = hoursWorked * basePay;
        } else {
            totalPay = 40 * basePay + (hoursWorked - 40) * basePay * 1.5;
        }

        System.out.println("Total pay: $" + totalPay);
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println("Employee 1:");
        calculatePay(7.50, 35);

        System.out.println("\nEmployee 2:");
        calculatePay(8.20, 47);

        System.out.println("\nEmployee 3:");
        calculatePay(10.00, 73);
    }
}
