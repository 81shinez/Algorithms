package com.algo;


public class Main {
    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();
        String[] strArr = {"mislav", "stanko", "mislav", "ana"};
        String[] strArr2 = {"mislav", "stanko", "ana"};

        int[] intArr1 = {1,1,9,1,1,1};
        int[] intArr2 = {1,30,5};

//        int[][] intArr3 = {{0, 10},{4, 10}, {5, 11}, {15, 2}};
        int[][] intArr3 = {{0, 10}, {2, 10}, {9,10}, {15,2}};
//        int[][] intArr3 = {{0,3},{1,9},{2,6}};
        System.out.println("STARTS...");
        System.out.println("...INPUTS...");

        //System.out.println(Arrays.toString(strArr));

//        System.out.println("...OUTPUTS...");
//        System.out.println(algorithmRouter.printer.execute(intArr1, 0));
//        System.out.println(Arrays.toString(algorithmRouter.developeFunction.execute(intArr1, intArr2)));
        System.out.println("OUTPUTS-> "+algorithmRouter.diskController.execute(intArr3));

        System.out.println("END...");

    }
}
