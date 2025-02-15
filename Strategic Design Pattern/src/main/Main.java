package main;

import strategy.*;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe", "123"));
        context.executePayment(100);

        // Pay with PayPal
        context.setPaymentStrategy(new PayPalPayment("johndoe@example.com", "password123"));
        context.executePayment(200);
    }
}
