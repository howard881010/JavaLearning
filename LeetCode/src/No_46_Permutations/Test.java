package No_46_Permutations;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        List<List<Integer>> answer = s.permute(nums);
        System.out.println(answer);

    }
}
