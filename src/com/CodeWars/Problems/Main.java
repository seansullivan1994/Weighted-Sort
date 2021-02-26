package com.CodeWars.Problems;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Original String");
        System.out.println("103 123 4444 99 2000");
        System.out.println("Calculated String");
        System.out.println(WeightSort.orderWeight("103 123 4444 99 2000"));
        System.out.println("Correct String");
        System.out.println("2000 103 123 4444 99");
    }
}
