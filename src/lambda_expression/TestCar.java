package lambda_expression;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Toyota();
        car.start();
        car.stop();
        car.honk();
        car.price(23, 56);

        Toyota toyota = new Toyota();
        toyota.toyota();
        toyota.start();
        toyota.stop();
        toyota.honk();
        toyota.price(34,56);

    }
}
