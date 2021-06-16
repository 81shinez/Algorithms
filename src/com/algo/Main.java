package com.algo;

public class Main {
    static void increase(Integer a){
        a = a+1;
    }

    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();

        System.out.println("STARTS...");

        System.out.println("OUTPUTS-> ");

//        Scanner sc = new Scanner(System.in);

        Integer a = 0;
        increase(a);
        System.out.println(a);

        System.out.println("END...");

    }
}
