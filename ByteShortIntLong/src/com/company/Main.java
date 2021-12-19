package com.company;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;

	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value : " + myMinIntValue);
        System.out.println("Integer maximum Value : " + myMaxIntValue);
        System.out.println("Busted MAX value :" + (myMaxIntValue+1));
        System.out.println("Busted MIN value :" +(myMinIntValue - 1));
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value : " + myMinByteValue);
        System.out.println("Byte Maximum Value : "+ myMaxByteValue);
    }
}
    