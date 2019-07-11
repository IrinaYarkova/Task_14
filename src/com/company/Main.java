package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        String s = in.nextLine();
        int x = Integer.parseInt(s);
        double y = (double) x;
        System.out.println("String: " + s + "\nInt: " + x + "\nDouble: " + y);
        in.close();
    }
}