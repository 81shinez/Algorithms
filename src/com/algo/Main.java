package com.algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();

        System.out.println("STARTS...");

        System.out.println("OUTPUTS-> ");
        System.out.println(algorithmRouter.immigrationCheck(100, new int[]{1, 10, 100}));

        System.out.println("END...");

    }
}
