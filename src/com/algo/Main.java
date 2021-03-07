package com.algo;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static int minimumLengthEncoding(String[] words) {
        int sum = 0;
        HashSet<String> indices = new HashSet<>(Arrays.asList(words));
        for(String word : words){
            for(int idx = 1; idx < word.length(); idx++){
                indices.remove(word.substring(idx));
            }
        }
        for(String str : indices){
            sum += str.length() + 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();

        System.out.println("STARTS...");

        System.out.println("OUTPUTS-> ");
//        System.out.println(algorithmRouter.farthestNode(n, vertex));

        String[] s = {"mokgggq","pjdislx","bfrbsfs"};
        System.out.println(minimumLengthEncoding(s));

        System.out.println("END...");

    }
}
