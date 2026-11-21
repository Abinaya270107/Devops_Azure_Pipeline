package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hour:");
        int h;
        h = sc.nextInt();
        int result = h * 3600;
        System.out.println("Seconds : "+result);
        sc.close();
    }
}