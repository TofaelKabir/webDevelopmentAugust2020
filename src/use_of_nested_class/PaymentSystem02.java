package use_of_nested_class;

public class PaymentSystem02 {
    PayByPayPal payByPayPal = new PayByPayPal();
    PayByCrypto payByCrypto = new PayByCrypto();
    PayByCreditCard payByCreditCard = new PayByCreditCard();


    public void processPayment() { // method of outer class
        System.out.println("process customer payment");
        payByPayPal.processPaymentByPayPal();
        payByCrypto.processPaymentByCrypto1(); //static method
        payByCrypto.processPaymentByCrypto2(); //non-static method
        payByCreditCard.processPaymentByCreditCard();
    }

    public class PayByPayPal {
        public void processPaymentByPayPal() {
            System.out.println("process customer payment by PayPal");
        }
    }

    public static class PayByCrypto {
        public static void processPaymentByCrypto1() {
            System.out.println("process customer payment by Crypto -- static method");
        }

        public void processPaymentByCrypto2() {
            System.out.println("process customer payment by Crypto -- non-static method");
        }
    }

    public class PayByCreditCard {
        public void processPaymentByCreditCard() {
            System.out.println("process customer payment by Credit Card");
        }
    }
}
