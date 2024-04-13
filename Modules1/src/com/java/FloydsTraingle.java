package com.java;

import java.util.Scanner;

public class FloydsTraingle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of rows for traingle");
        int rows =Integer.parseInt(scanner.nextLine().trim());

        int value=1;
        for(int i=0; i<rows; i++){
            for(int j=0; j<(i+1); j++,value++){
                System.out.print(value+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

class Pattern1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of rows to print");
        int N= Integer.parseInt(scanner.nextLine().trim());
        for(int i=1; i<=N;i++){
            for(int j=1; j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();
            scanner.close();
        }
    }
}

class Pattern2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of rows to print");
        int N=Integer.parseInt(scanner.nextLine().trim());

        for(int i=1; i<=N ;i++){
            for(int j=1; j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
class Pattern3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of rows to print");
        int N=Integer.parseInt(scanner.nextLine().trim());

        for(int i=1; i<=N; i++){
            for(int j=N; j>=i; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

class Pattern4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of rows to print");
        int N= Integer.parseInt(scanner.nextLine().trim());
        for(int i=N; i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();
            scanner.close();
        }
    }
}
