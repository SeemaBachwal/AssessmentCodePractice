package com.example.visagca;

public class NeighborSum {
    public int[] transform(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = nums[i];
            if (i > 0) sum += nums[i - 1];
            if (i < n - 1) sum += nums[i + 1];
            res[i] = sum;
        }
        return res;
    }
}
