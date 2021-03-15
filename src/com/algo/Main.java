package com.algo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();

        System.out.println("STARTS...");

        System.out.println("OUTPUTS-> ");

        System.out.println(algorithmRouter.transformWord("hit", "cog", new String[]{"hot","dot","dog","lot","log","cog"}));

        System.out.println("END...");

    }
}
