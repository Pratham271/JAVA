package academy.learnprogramming.temptrees;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(50);
       // System.out.println(x);
        int [] arr = new int[x];
        for(int i = 0; i<x; i++){
            System.out.println(arr[i]);
        }
    }
}
