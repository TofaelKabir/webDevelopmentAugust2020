package lambda_expression;

public class DifferentTypeOfMethod {
    public void color (){
        System.out.println("Color is red");
    }

    public int price(int a, int b) {// int type return method
        int total = a+b;
        System.out.println("Addition of a & b: "+total);
        return total;
    }

    public static void main(String[] args) {
        DifferentTypeOfMethod dtm = new DifferentTypeOfMethod();
        dtm.color();
        dtm.price(120,230);
    }
}
