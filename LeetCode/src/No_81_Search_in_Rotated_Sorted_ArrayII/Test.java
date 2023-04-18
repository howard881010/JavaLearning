package No_81_Search_in_Rotated_Sorted_ArrayII;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3, 1};
        boolean rs = s.search(arr, 1);
        System.out.println(rs);
    }
}

class Solution {
    public boolean search(int[] nums, int target) {
        int loc = 0;
        int[] sortedNums = new int[nums.length];
        boolean flag = true;
        int j = 0;
        while(flag) {
            if (j < nums.length - 1) {
                if (nums[j] > nums[j + 1]) {
                    loc = j + 1;
                    flag = false;
                }
                j++;
            } else {
                flag = false;
            }
        }
        System.out.println("loc = " + loc);

        for (int i = 0; i < nums.length - loc; i++) {
            sortedNums[i] = nums[i + loc];
        }
        for (int i = 0; i < loc; i++) {
            sortedNums[i + nums.length - loc] = nums[i];
        }
        System.out.println(Arrays.toString(sortedNums));
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {

            int mid = (low + high) / 2;
            System.out.println(mid);
            if (sortedNums[mid] == target) {
                return true;
            } else if (sortedNums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
