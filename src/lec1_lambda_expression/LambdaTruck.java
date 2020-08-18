package lec1_lambda_expression;

// Functional interface always have 1 method. This Annotation helps developers not to add to more method on it
@FunctionalInterface
public interface LambdaTruck {
    public void lengthCount(String s);
}
