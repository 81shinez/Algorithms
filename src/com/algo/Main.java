package com.algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();
        String[] strArr = {"119", "97674223", "1195524421"};

        System.out.println("STARTS...");
        System.out.println("...INPUTS...");

        System.out.println(Arrays.toString(strArr));

        System.out.println("...OUTPUTS...");
        System.out.println(algorithmRouter.phoneNumberList.execute(strArr));

        System.out.println("END...");
    }
}
