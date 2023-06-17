package org.spring7;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main{

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        Expression expression = parser.parseExpression("'My Name is Mohit'.length()");
        Integer result = (Integer) expression.getValue();
        System.out.println("Result of expression 1: " + result);

        expression = parser.parseExpression("2 + 3 * 4");
        int arithmeticResult = (Integer) expression.getValue();
        System.out.println("Result of expression 2: " + arithmeticResult);

        StandardEvaluationContext context = new StandardEvaluationContext();
        context.setVariable("a", 10);
        context.setVariable("b", 5);
        expression = parser.parseExpression("#a * (#b + 1)");
        int variableResult = (Integer) expression.getValue(context);
        System.out.println("Result of expression 3: " + variableResult);

        boolean isEven = true;
        context.setVariable("EvenOrOdd", isEven);
        expression = parser.parseExpression("#EvenOrOdd ? 'Even' : 'Odd'");
        String conditionalResult = (String) expression.getValue(context);
        System.out.println("Result of expression 4: " + conditionalResult);
    }
}
