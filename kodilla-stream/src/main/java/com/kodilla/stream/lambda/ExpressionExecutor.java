package com.kodilla.stream.lambda;

public class ExpressionExecutor {
    public ExpressionExecutor(double a , double b , MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a , b);
        System.out.println(result);
    }
}
