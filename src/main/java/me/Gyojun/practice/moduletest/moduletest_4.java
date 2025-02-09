package main.java.me.Gyojun.practice.moduletest;

public class moduletest_4 {
    public static void main(String[] args) {
        int totalsum = 0;
        int count = 0;
        int sum=0;

        while(totalsum<100){

            count++;
            sum += count;
            totalsum += sum;
        }
        System.out.println("count : "+count);
        System.out.println("totalsum : "+totalsum);
    }

}
