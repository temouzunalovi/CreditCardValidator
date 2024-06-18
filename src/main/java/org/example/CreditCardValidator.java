package org.example;

public class CreditCardValidator {

    public static boolean isValidCreditCard(String cardNumber) {
        int sum = 0;
        boolean alternate = false;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));

            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n -= 9;
                }
            }

            sum += n;
            alternate = !alternate;
        }


        return (sum % 10 == 0);
    }

    public static void main(String[] args) {
        String cardNumber = "4532015112830366";
        if (isValidCreditCard(cardNumber)) {
            System.out.println(cardNumber + " is a valid credit card number.");
        } else {
            System.out.println(cardNumber + " is an invalid credit card number.");
        }
    }
}
