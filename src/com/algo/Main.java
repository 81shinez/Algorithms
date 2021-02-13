package com.algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();
        String[] strArr = {"mislav", "stanko", "mislav", "ana"};
        String[] strArr2 = {"mislav", "stanko", "ana"};

        System.out.println("STARTS...");
        System.out.println("...INPUTS...");

        System.out.println(Arrays.toString(strArr));

        System.out.println("...OUTPUTS...");
        System.out.println(algorithmRouter.failedRunner.execute(strArr, strArr2));

        System.out.println("END...");
    }
}
