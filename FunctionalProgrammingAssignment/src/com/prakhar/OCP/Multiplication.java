package com.prakhar.OCP;

public class Multiplication implements Operation{
    public double first_num;
    public double second_num;

    public Multiplication(double first_num, double second_num){
        this.first_num = first_num;
        this.second_num = second_num;
    }
    // overriding perform method
    public double perform(){
        return this.first_num * this.second_num;
    }
}
