package com.dalal.OOP;

public class VarArgs {

    public static int sum (int ... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(10,20,30,2,5,3));
    }
}
