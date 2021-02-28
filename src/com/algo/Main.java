package com.algo;
import com.algo.kit.bruteForce.findingPrimeNumber.FindingPrimeNumber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();

        System.out.println();

        String[] strArr2 = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};

        System.out.println("STARTS...");

        System.out.println("OUTPUTS-> ");
        System.out.println(FindingPrimeNumber.execute("012"));

        System.out.println("END...");

    }
}
