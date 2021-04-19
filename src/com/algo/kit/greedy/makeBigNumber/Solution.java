package com.algo.kit.greedy.makeBigNumber;

//class Solution {
//    String stringMax(String str1, String str2){
//        if(str1.compareTo(str2) > 0) return str1;
//        return str2;
//    }
//
//    public String solution(String number, int k) {
//        for(int i = 0; i < k; i++){
//            String strMax = "0";
//            for(int idx = 0; idx < number.length(); idx++){
//                strMax = stringMax(strMax, number.substring(0,idx)+number.substring(idx+1));
//            }
//            number = strMax;
//        }
//        return number;
//    }
//}

//class Solution {
//    public String solution(String number, int k) {
//        char maxVal;
//        int pos = 0;
//        StringBuilder sb = new StringBuilder();
//        for(int cnt = number.length() - k; cnt > 0 ; cnt--){
//            maxVal = '0';
//            for(int idx = pos; idx < number.length() - cnt + 1; idx++){
//                if(number.charAt(idx) > maxVal){
//                    maxVal = number.charAt(idx);
//                    pos = idx+1;
//                }
//            }
//            sb.append(maxVal);
//        }
//        return sb.toString();
//    }
//}

class Solution {
    public String solution(String number, int k) {
        char maxVal;
        int pos = 0;
        StringBuffer sb = new StringBuffer();
        for(int cnt = number.length() - k; cnt > 0 ; cnt--){
            maxVal = '0';
            for(int idx = pos; idx < number.length() - cnt + 1; idx++){
                if(number.charAt(idx) > maxVal){
                    maxVal = number.charAt(idx);
                    pos = idx+1;
                }
            }
            sb.append(maxVal);
        }
        return sb.toString();
    }
}