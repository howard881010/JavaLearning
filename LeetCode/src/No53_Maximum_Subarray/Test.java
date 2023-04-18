package No53_Maximum_Subarray;

public class Test {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] nums = {-1, -2};
        System.out.println(s1.maxSubArray(nums));
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int i = 0;
        int sum = 0;
        int maxSum = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        while (i < nums.length) {
            if (nums[i] < 0 && i < (nums.length - 1)) {
                if ((nums[i] + nums[i + 1]) <= 0) {
                    if (sum > maxSum) {
                        maxSum = sum;
                    } else if (sum + nums[i] > 0) {
                        sum += nums[i++];
                    } else {
                        sum = 0;
                        i++;
                    }
                } else {
                    sum += nums[i++];
                }
            } else if (nums[i] > 0){
                if (sum < 0) {
                    sum = nums[i++];
                } else {
                    sum += nums[i++];
                }
            } else {
                sum = nums[i++];
                if (maxSum == 0) {
                    maxSum = sum;
                } else if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return Math.max(sum, maxSum);
    }
}
