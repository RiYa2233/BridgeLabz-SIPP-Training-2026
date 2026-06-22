package practice_problems;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class HospitalBiling {

    public static void main(String[] args) {

        try {
            int bills = 1000;
            int items = 0;
            System.out.println("Bill per item: " + (bills / items));
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero items.");
        }

        try {
            int[] patients = {101, 102, 103};
            System.out.println(patients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            int amount = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number input.");
        }

        try {
            makePayment(500, 1000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    static void makePayment(int balance, int bill)
            throws InsufficientFundsException {

        if (balance < bill)
            throw new InsufficientFundsException(
                    "Error: Insufficient funds for payment.");

        System.out.println("Payment Successful");
    }
}