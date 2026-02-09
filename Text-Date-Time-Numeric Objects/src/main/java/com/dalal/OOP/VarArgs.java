package com.dalal.OOP;

public class VarArgs {

    public static int sum (int  b, int ... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum * b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,3,4));
    }
}


/*cycle loop constructor invocation is not allowed*/