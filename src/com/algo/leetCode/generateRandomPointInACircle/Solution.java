package com.algo.leetCode.generateRandomPointInACircle;

class Solution {
    double radius; double x_center; double y_center;

    public Solution(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public double[] randPoint() {
        double deg = Math.random() * (Math.PI * 2);
        double rad = Math.sqrt(Math.random()) * radius;
        return new double[]{(rad * Math.cos(deg)) + x_center,(rad * Math.sin(deg)) + y_center};
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */