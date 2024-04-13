package com.java;

import java.util.Scanner;

public class EvenNumberSeries{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the N value : ");
        int N=scanner.nextInt();

        System.out.println("Even numbers upto "+N);
        for(int i=1; i<=N ;i+=2){
            System.out.println(i+" ");
        }
    }
}
class FibonacciSeries{
    public static void main(String[] args) {
        int N=10;
        int num1=0;
        int num2=1;

        System.out.println("Fibonacci series N="+N);
        System.out.print(num1+" "+num2);
        int i=2;
        while(i<=N){
            i++;
            int temp=num1+num2;
            num1=num2;
            num2=temp;
            System.out.print(" "+num2);
        }
    }
}

class Fibonacci2{
    public static void main(String[] args) {
        int N=10;
        int num1=0;
        int num2=1;

        System.out.println("fibonacci series for N:"+N);
        System.out.print(num1+" "+num2);
        int i=2;
        while(i<N){
            i++;
           int temp=num1+num2;
           num1=num2;
           num2=temp;
            System.out.print(" "+num2);

        }

    }
}
