package com.company;
import java.util.Scanner;

public class EuclidInverse
{
    public static int find_inverse(int n,int m)
    {
        int x1 = 1;
        int m0 = m, t, q;
        int x0 = 0;
        while (n > 1)
        {
            q = n / m;
            t = m;

            m = n % m;
            n = t;

            t = x0;

            x0 = x1 - q * x0;

            x1 = t;


            if (x1 < 0) {
                x1 = x1+ m0;
            }
        }
        return x1;

    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n =s.nextInt();

        System.out.println("Enter mod ");
        int m =s.nextInt();

        int i = find_inverse(n, m);

        System.out.println("gcd of " + n + "& " + m + " = " + i);
    }
}
