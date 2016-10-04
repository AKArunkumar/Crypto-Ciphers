package com.company;

import java.util.Scanner;
public class EuclidGCD {
    //find_gcd function to find GCD of two numbers
    public static int find_gcd(int p,int q)
    {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int p =s.nextInt();

        System.out.println("Enter 2nd number");
        int q =s.nextInt();

        int d2 = find_gcd(p, q);

        System.out.println("GCD of " + p + " & " + q + " = " + d2);
    }

}
