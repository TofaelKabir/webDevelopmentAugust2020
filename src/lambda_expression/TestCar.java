package lambda_expression;

public class TestCar {
    public static void main(String[] args) {
        System.out.println("\n-------------------- Interface Instantiated by Concrete class ---------------------");
        Car car = new Toyota();
        car.start();
        car.stop();
        car.honk();
        car.price(23, 56);

        System.out.println("\n-------------------- Class Instantiated by creating object ---------------------");
        Toyota toyota = new Toyota();
        toyota.toyota();
        toyota.start();
        toyota.stop();
        toyota.honk();
        toyota.price(34,56);

        System.out.println("\n-------------------- Interface Instantiated as anonymous class ---------------------");
        Car car1 = new Car() {
            @Override
            public void start() {
                System.out.println("Start method From Car Interface");
            }

            @Override
            public void stop() {
                System.out.println("Stop method From Car Interface");
            }

            @Override
            public void honk() {
                System.out.println("honk method From Car Interface");
            }

            @Override
            public int price(int a, int b) {
                int total = a+b;
                System.out.println("Addition of a & b: "+total);
                return total;
            }
        };
        car1.start();
        car1.stop();
        car1.honk();
        car1.price(34, 54);

        System.out.println("\n-------------------- Interface Instantiated by Lambda expression 01 ---------------------");
        LambdaCar lambdaCar01 = () -> System.out.println("Start method From Car Interface");
        lambdaCar01.start();

        System.out.println("\n-------------------- Interface Instantiated by Lambda expression 02 ---------------------");
        LambdaCar lambdaCar02 = () -> {
            System.out.println("Start method From Car Interface");
            System.out.println("If there is 2 statement or logics, we have to write like this way");
        };
        lambdaCar02.start();

        System.out.println("\n-------------------- Interface Instantiated by Lambda expression 03 ---------------------");
        LambdaTaxi lambdaTaxi = (a, b) -> {
            System.out.println(a+b);
            return a+b;
        };
        lambdaTaxi.price(23, 45);

        System.out.println("\n-------------------- Interface Instantiated by Lambda expression 04 ---------------------");
        LambdaTruck lambdaTruck = s -> System.out.println(s.length());
        lambdaTruck.lengthCount("Joy Bangla, Lungi Shamla");


    }
}
