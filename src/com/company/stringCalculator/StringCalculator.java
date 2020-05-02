package com.company.stringCalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    //проверка, является ли строка оператором
    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    //метод, производящий операцию над двумя числами
    private static double calculate(double a, char operator, String b) {
        switch (operator) {
            case '+':
                a += Double.parseDouble(b);
                break;
            case '-':
                a -= Double.parseDouble(b);
                break;
            case '*':
                a *= Double.parseDouble(b);
                break;
            case '/':
                a /= Double.parseDouble(b);
                break;
        }
        return a;
    }

    //метод подсчета токенов:
    //не предусмотрены скобки
    // и правильная очередность операторов
    private static double calculateTokens(String[] tokens) {
        char operator = 0;
        double result = 0;

        for (String token : tokens) { //проходим выражение
            //System.out.println(token);
            if (isOperator(token.charAt(0))) { //если это оператор
                operator = token.charAt(0); //запоминаем оператор
            }
            else {
                if (operator == 0) { //случай для первого элемента
                    result = Double.parseDouble(token);
                }
                else { //производим операцию в зависимости от оператора
                    result = calculate(result, operator, token);
                }
            }
        }
        return result;
    }

    //метод подсчета выражения с помощью regex;
    public static double calculateWithRegex(String expression) {
        //разбиваем на токены с помощью regex
        String[] tokens = expression.split("(?<=[^\\d.])(?=\\d)|(?<=\\d)(?=[^\\d.])");
        return calculateTokens(tokens);
    }

    public static double calculateWithoutRegex(String expression) {

        char[] exp = expression.toCharArray();
        List<String> tokens = new ArrayList<>();
        StringBuilder buffer = new StringBuilder();

        //разбитие на токены
        for (int i = 0; i <= exp.length - 1;) { //проходим все выражение
            if (isOperator(exp[i])) { //если это оператор
                tokens.add(String.valueOf(exp[i])); //добавляет в токены
                i++;
            }
            else {
                //buffer.append(exp[i]);
                while (i <= exp.length - 1 && !isOperator(exp[i])) {//составляется число, пока след. символ не знак
                    buffer.append(exp[i]);
                    i++;
                }
                tokens.add(buffer.toString()); //добавляет в токены
                buffer.delete(0, buffer.length());
            }
        }

        return calculateTokens(tokens.toArray(new String[0]));
    }

    public static void main(String[] args) {
        String expression = "1-74+0.4/2+0.5*4";
        double resultRegex = calculateWithRegex(expression); // => 2.8 (= 1-1+0.4/2+0.5*4)
        double result = calculateWithoutRegex(expression);

        System.out.println("Результат с использованием regex:");
        System.out.println(expression + " = " + resultRegex);

        System.out.println("Результат без использования regex:");
        System.out.println(expression + " = " + result);
    }
}
