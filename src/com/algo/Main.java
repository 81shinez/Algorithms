package com.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();

        System.out.println("STARTS...");

        System.out.println("OUTPUTS-> ");

        System.out.println(algorithmRouter.rank(5, new int[][]{{4,3},{4,2},{3,2},{1,2},{5, 2}}));

        System.out.println(algorithmRouter.rank(2, new int[][]{{1, 2}}));
        System.out.println(algorithmRouter.rank(3, new int[][]{{1, 2}, {1, 3}}));

        System.out.println("END...");

    }
}
