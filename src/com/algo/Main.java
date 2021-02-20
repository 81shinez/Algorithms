package com.algo;


public class Main {
    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();

        int n = 5;
        int[] intArr1 = {2,4};
        int[] intArr2 = {1,3,5};

        System.out.println("STARTS...");
        System.out.println("OUTPUTS-> ");

        System.out.println(algorithmRouter.trainingSuit.execute(5, intArr1, intArr2));

        System.out.println("END...");

    }
}
