package com.algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();
        String[] strArr = {"mislav", "stanko", "mislav", "ana"};
        String[] strArr2 = {"mislav", "stanko", "ana"};

        int[] intArr1 = {7,4,5,6};
        int[] intArr2 = {1,30,5};

        System.out.println("STARTS...");
        System.out.println("...INPUTS...");

        //System.out.println(Arrays.toString(strArr));

        System.out.println("...OUTPUTS...");
        System.out.println(algorithmRouter.truckOnBridge.execute(2, 10, intArr1));
//        System.out.println(Arrays.toString(algorithmRouter.developeFunction.execute(intArr1, intArr2)));

        System.out.println("END...");
    }
}
