package com.pedidosya.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.calc(i));
        }
    }

    public String calc(int value){
        return String.valueOf(value);
    }
}
