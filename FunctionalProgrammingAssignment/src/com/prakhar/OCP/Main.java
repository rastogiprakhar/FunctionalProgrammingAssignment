package com.prakhar.OCP;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calci = new Calculator();
        Addition add = new Addition(10,15);
        Subtraction sub = new Subtraction(20,30);
        Multiplication mul = new Multiplication(40,50);

        calci.calculate(add);
        double addResult=add.perform();
        System.out.println("Addition of both number is:  "+addResult);

        calci.calculate(sub);
        double subResult=sub.perform();
        System.out.println("Subtraction of both number is:  "+subResult);

        calci.calculate(mul);
        double mulResult=mul.perform();
        System.out.println("Multiplication of both number is:  "+mulResult);
    }
}
