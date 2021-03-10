package com.algo;

public class Main {

    public static String intToRoman(int num) {
        String answer = "";

        for(int idx = 0; idx < num / 1000; idx++) answer = answer.concat("M");
        num %= 1000;
        for(int idx = 0; idx < num / 900; idx++) answer = answer.concat("CM");
        num %= 900;
        for(int idx = 0; idx < num / 500; idx++) answer = answer.concat("D");
        num %= 500;
        for(int idx = 0; idx < num / 400; idx++) answer = answer.concat("CD");
        num %= 400;
        for(int idx = 0; idx < num / 100; idx++) answer = answer.concat("C");
        num %= 100;
        for(int idx = 0; idx < num / 90; idx++) answer = answer.concat("XC");
        num %= 90;
        for(int idx = 0; idx < num / 50; idx++) answer = answer.concat("L");
        num %= 50;
        for(int idx = 0; idx < num / 40; idx++) answer = answer.concat("XL");
        num %= 40;
        for(int idx = 0; idx < num / 10; idx++) answer = answer.concat("X");
        num %= 10;
        for(int idx = 0; idx < num / 9; idx++) answer = answer.concat("IX");
        num %= 9;
        for(int idx = 0; idx < num / 5; idx++) answer = answer.concat("V");
        num %= 5;
        for(int idx = 0; idx < num / 4; idx++) answer = answer.concat("IV");
        num %= 4;
        for(int idx = 0; idx < num / 1; idx++) answer = answer.concat("I");

        return answer;
    }

    public static void main(String[] args) {
        AlgorithmRouter algorithmRouter = new AlgorithmRouter();

        System.out.println("STARTS...");

        System.out.println("OUTPUTS-> ");
        System.out.println(intToRoman(1994));

        System.out.println("END...");

    }
}
