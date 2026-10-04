class Solution {
    public int trap(int[] height) {
        // this is using 2 pointers
        // O(n) - time complexity
        // O(1) - space complexity

        // int w = 0;
        // int left = 0, right = height.length - 1;
        // int leftMax = 0, rightMax = 0;
        
        // while (left < right) {
        //     if (height[left] < height[right]) {
        //         if (height[left] >= leftMax) {
        //             leftMax = height[left];
        //         } else {
        //             w += leftMax - height[left];
        //         }
        //         left++;
        //     } else {
        //         if (height[right] >= rightMax) {
        //             rightMax = height[right];
        //         } else {
        //             w += rightMax - height[right];
        //         }
        //         right--;
        //     }

        // }
        // return w;

// ===============
        // using prefix and suffix array for keeping the track of leftmax and rightMax for all the index
        // O(n) -- time complexity
        // O(n) -- space complexity
        int n = height.length;
        if (n == 0) {
            return 0;
        }

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return res;
    }
}
