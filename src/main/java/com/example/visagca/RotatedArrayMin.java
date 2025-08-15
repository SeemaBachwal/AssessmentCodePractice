package com.example.visagca;

public class RotatedArrayMin {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;  // Min is on the right side
            } else {
                right = mid;  // Min is mid or to the left
            }
        }
        return nums[left];
    }
}
