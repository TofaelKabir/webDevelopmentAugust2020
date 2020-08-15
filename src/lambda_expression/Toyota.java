package lambda_expression;

public class Toyota implements Car {
    public void toyota(){
        System.out.println("toyota method from Toyota class");
    }

    @Override
    public void start() {
        System.out.println("start method from Car Interface");
    }

    @Override
    public void stop() {
        System.out.println("stop method from Car Interface");
    }

    @Override
    public void honk() {
        System.out.println("honk method from Car Interface");
    }

    @Override
    public int price(int a, int b) {
        int total = a+b;
        System.out.println("Addition of a & b: "+total);
        return total;
    }


}
