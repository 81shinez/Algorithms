package com.algo;

public class Main {
    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();

        int[][] arr = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        
        System.out.println("STARTS...");

        System.out.println("OUTPUTS-> ");
        System.out.println(algorithmRouter.integerTriangle(arr));

        System.out.println("END...");

    }
}
