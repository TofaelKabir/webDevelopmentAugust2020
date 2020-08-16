package use_of_nested_class;

// To organize code: command/control + Alt + l

public class PaymentSystem03 { //opening of outer class body
    PayByPayPal payByPayPal = new PayByPayPal();
    PayByCrypto payByCrypto = new PayByCrypto();
    PayByCreditCard payByCreditCard = new PayByCreditCard();

    // static member
    static int outer_x = 10;
    // instance(non-static) member
    int outer_y = 20;
    // private member
    private static int outer_private = 30;

    public void processPayment() { // method of outer class
        System.out.println("process customer payment");
    }

    private void processPayment1() { // method of outer class
        System.out.println("process customer payment");
    }

    protected void processPayment2() { // method of outer class
        System.out.println("process customer payment");
    }

    public class PayByPayPal {//opening of inner class body
        public void processPaymentByPayPal() {
            System.out.println("process customer payment by PayPal");

            //The below variables don't work for static class(checked)
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);
            // can access display private static member of outer class
            System.out.println("outer_private = " + outer_private);
            // The following statement will give compilation error
            // as static nested class cannot directly access non-static membera
            // System.out.println("outer_y = " + outer_y);
        }
    }//closing of inner class body

    public static class PayByCrypto {//opening of static nested class body
        public static void processPaymentByCrypto1() {
            System.out.println("process customer payment by Crypto -- static method");

        }

        public void processPaymentByCrypto2() {
            System.out.println("process customer payment by Crypto -- non-static method");
        }
    }//closing of static nested class body

    public class PayByCreditCard {//opening of inner class body
        public void processPaymentByCreditCard() { // a non-static method cannot contain a static method
            System.out.println("process customer payment by Credit Card");

            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);

            // can access display private static member of outer class
            System.out.println("outer_private = " + outer_private);

            // The following statement will give compilation error
            // as static nested class cannot directly access non-static membera
            // System.out.println("outer_y = " + outer_y);

            System.out.println("--The below methods are coming from outer class/nested static class/inner class--");
            processPayment(); //method from outer class can be accessed directly
            payByPayPal.processPaymentByPayPal(); //non-static method from inner class through their instance/object
            payByCrypto.processPaymentByCrypto1(); //static method from static nested class through their instance/object
            payByCrypto.processPaymentByCrypto2(); //non-static method from static nested class through their instance/object
        }
    }//closing of inner class body
} //closing of outer class body
