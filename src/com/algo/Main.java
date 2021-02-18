package com.algo;


import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();
        String[] strArr = {"mislav", "stanko", "mislav", "ana"};
        String[] strArr2 = {"mislav", "stanko", "ana"};

        int[] intArr1 = {1,1,9,1,1,1};
        int[] intArr2 = {1,30,5};

        int[][] intArr3 = {{2,5,3},{4,4,1},{1,7,3}};

        System.out.println("STARTS...");
        System.out.println("...INPUTS...");

        //System.out.println(Arrays.toString(strArr));

        System.out.println("...OUTPUTS...");
        System.out.println(algorithmRouter.printer.execute(intArr1, 0));
//        System.out.println(Arrays.toString(algorithmRouter.developeFunction.execute(intArr1, intArr2)));

        System.out.println("END...");

    }
}
