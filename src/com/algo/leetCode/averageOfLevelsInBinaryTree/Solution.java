package com.algo.leetCode.averageOfLevelsInBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
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

    public double getAverage(LinkedList<TreeNode> linkedList){
        long sum = 0;
        for(TreeNode treeNode : linkedList){
            sum += treeNode.val;
        }
        return (double)sum / linkedList.size();
    }

//    public List<Double> averageOfLevels(TreeNode root) {
//        LinkedList<TreeNode> linkedList = new LinkedList<>();
//        LinkedList<TreeNode> nextList = new LinkedList<>();
//        List<Double> answerList = new ArrayList<>();
//        linkedList.add(root);
//
//        while (!linkedList.isEmpty()){
//            answerList.add(getAverage(linkedList));
//            nextList.clear();
//            while (!linkedList.isEmpty()){
//                TreeNode treeNode = linkedList.poll();
//                if(treeNode.left != null) nextList.add(treeNode.left);
//                if(treeNode.right != null) nextList.add(treeNode.right);
//            }
//            linkedList.addAll(nextList);
//        }
//
//        return answerList;
//    }

    public List<Double> averageOfLevels(TreeNode root) {
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        List<Double> answerList = new ArrayList<>();
        linkedList.add(root);
        long sum;
        int size;

        while (!linkedList.isEmpty()){
            sum = 0;
            size = linkedList.size();
            for(int idx = 0; idx < size; idx++){
                TreeNode treeNode = linkedList.poll();
                sum += treeNode.val;
                if(treeNode.left != null) linkedList.addLast(treeNode.left);
                if(treeNode.right != null) linkedList.addLast(treeNode.right);
            }
            answerList.add((double)sum / size);
        }
        return answerList;
    }
}