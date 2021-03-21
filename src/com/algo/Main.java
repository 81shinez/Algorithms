package com.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static boolean reorderedPowerOf2(int N) {
        for (int i = 0; i < 31; ++i)
            if ((N == (1 << i)))
                return true;
        return false;
    }

    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();

        System.out.println("STARTS...");

        System.out.println("OUTPUTS-> ");

        System.out.println(reorderedPowerOf2(10));
        System.out.println(reorderedPowerOf2(679213508));
        System.out.println(reorderedPowerOf2(61));
//        System.out.println(reorderedPowerOf2(344353235));

        System.out.println("END...");

    }
}
