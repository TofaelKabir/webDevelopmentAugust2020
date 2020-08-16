package use_of_nested_class;

public class MakePayment {
    public static void main(String[] args) {
        System.out.println("\n------------------- First Output -------------------");
        PaymentSystem01 ps01 = new PaymentSystem01();
        ps01.processPayment();
        ps01.payByPayPal.processPaymentByPayPal();
        ps01.payByCrypto.processPaymentByCrypto1(); //static method
        ps01.payByCrypto.processPaymentByCrypto2(); //non-static method
        ps01.payByCreditCard.processPaymentByCreditCard();

        System.out.println("\n------------------- Second Output -------------------");
        PaymentSystem02 ps02 = new PaymentSystem02();
        ps02.processPayment();

        System.out.println("\n------------------- if it is static nested class -------------------");
        PaymentSystem02.PayByCrypto ps = new PaymentSystem02.PayByCrypto();
        ps.processPaymentByCrypto2(); // this is the non-static method of
        PaymentSystem02.PayByCrypto.processPaymentByCrypto1(); // because the method is static

        System.out.println("\n------------------- Third Output -------------------");
        PaymentSystem03 ps03 = new PaymentSystem03();
        ps03.payByPayPal.processPaymentByPayPal();
        ps03.payByCreditCard.processPaymentByCreditCard();

        System.out.println("\n------------------- Fourth Output: when Inner class are all private -------------------");
        PaymentSystem04 ps04 = new PaymentSystem04();
        ps04.processPayment(); // public method is called, but not the protected method
        ps04.processPayment2(); //protected method is called
        //Unlike a class, an inner class can be private and once you declare an inner class private,
        //it cannot be accessed from an object outside the class.


    }
}
