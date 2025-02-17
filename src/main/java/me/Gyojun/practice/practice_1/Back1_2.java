package main.java.me.Gyojun.practice.practice_1;

import java.util.Scanner;

public class Back1_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        long sum = 0;
        int count = 0;

        while(sum<=input-2){
            count++;
            sum+= 6*count;
        }
        System.out.println(count+1);

    }
}
