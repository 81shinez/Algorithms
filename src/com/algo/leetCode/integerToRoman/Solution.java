package com.algo.leetCode.integerToRoman;

//class Solution {
//    public String intToRoman(int num) {
//        String answer = "";
//
//        for(int idx = 0; idx < num / 1000; idx++) answer = answer.concat("M");
//        num %= 1000;
//        for(int idx = 0; idx < num / 900; idx++) answer = answer.concat("CM");
//        num %= 900;
//        for(int idx = 0; idx < num / 500; idx++) answer = answer.concat("D");
//        num %= 500;
//        for(int idx = 0; idx < num / 400; idx++) answer = answer.concat("CD");
//        num %= 400;
//        for(int idx = 0; idx < num / 100; idx++) answer = answer.concat("C");
//        num %= 100;
//        for(int idx = 0; idx < num / 90; idx++) answer = answer.concat("XC");
//        num %= 90;
//        for(int idx = 0; idx < num / 50; idx++) answer = answer.concat("L");
//        num %= 50;
//        for(int idx = 0; idx < num / 40; idx++) answer = answer.concat("XL");
//        num %= 40;
//        for(int idx = 0; idx < num / 10; idx++) answer = answer.concat("X");
//        num %= 10;
//        for(int idx = 0; idx < num / 9; idx++) answer = answer.concat("IX");
//        num %= 9;
//        for(int idx = 0; idx < num / 5; idx++) answer = answer.concat("V");
//        num %= 5;
//        for(int idx = 0; idx < num / 4; idx++) answer = answer.concat("IV");
//        num %= 4;
//        for(int idx = 0; idx < num / 1; idx++) answer = answer.concat("I");
//
//        return answer;
//    }
//}

class Solution{
    public String intToRoman(int num){
        String[] MMap = {"","M","MM","MMM"};
        String[] CMap = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] XMap = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] IMap = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        StringBuilder sb = new StringBuilder();
        return sb.append(MMap[num/1000]).append(CMap[num/100%10]).append(XMap[num/10%10]).append(IMap[num%10]).toString();
    }
}