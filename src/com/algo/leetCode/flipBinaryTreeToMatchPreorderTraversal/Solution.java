package com.algo.leetCode.flipBinaryTreeToMatchPreorderTraversal;

import java.util.*;

//class Solution {
//    //Definition for a binary tree node.
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode() {}
//        TreeNode(int val) { this.val = val; }
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//    int[] travel;
//    int travelIdx;
//    ArrayList<Integer> answerList = new ArrayList<>();
//
//    boolean flip(TreeNode treeNode){
//        if(treeNode.left == null || treeNode.right == null) return false;
//        answerList.add(treeNode.val);
//        TreeNode tmp = treeNode.left;
//        treeNode.left = treeNode.right;
//        treeNode.right = tmp;
//        return true;
//    }
//
//    void preOrder(TreeNode treeNode, int[] voyage){
//        travel[travelIdx] = treeNode.val;
//        if(travelIdx < voyage.length- 1)travelIdx++;
//        else return;
//        if(treeNode.left != null){
//            if (treeNode.left.val != voyage[travelIdx]) {
//                flip(treeNode);
//            }
//            preOrder(treeNode.left, voyage);
//        }
//        if(treeNode.right != null){
//            if (treeNode.right.val != voyage[travelIdx]) {
//                flip(treeNode);
//            }
//            preOrder(treeNode.right, voyage);
//        }
//    }
//
//    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
//        travel = new int[voyage.length];
//        travelIdx = 0;
//        preOrder(root, voyage);
//        if(!Arrays.equals(travel, voyage)) {
//            answerList.clear();
//            answerList.add(-1);
//        }
//        return answerList;
//    }
//}

class Solution {
    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int[] travel;
    int travelIdx;
    ArrayList<Integer> answerList = new ArrayList<>();

    void preOrder(TreeNode treeNode, int[] voyage){
        travel[travelIdx] = treeNode.val;
        if(travelIdx < voyage.length- 1)travelIdx++;
        else return;
        if(treeNode.left != null){
            if (treeNode.left.val != voyage[travelIdx]) {
                answerList.add(treeNode.val);
                if(treeNode.right != null) preOrder(treeNode.right, voyage);
                preOrder(treeNode.left, voyage);
                return;
            }
        }
        if(treeNode.left != null) preOrder(treeNode.left, voyage);
        if(treeNode.right != null) preOrder(treeNode.right, voyage);
    }

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        travel = new int[voyage.length];
        travelIdx = 0;
        preOrder(root, voyage);
        if(!Arrays.equals(travel, voyage)) {
            answerList.clear();
            answerList.add(-1);
        }
        return answerList;
    }
}

