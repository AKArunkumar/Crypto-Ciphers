package com.company;

public class Inverse_byEuclid {
    public static int  find_modulo_inverse(int first,int secend )
    {
        for(int i=1;i<=secend;i++)
        {
            if(((first*i)% secend)==1)
            {
                return i;
                //System.exit(0);
            }
        }
        return new java.lang.Integer(null) ;
    }
}
