package No_47_PermutationsII;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;
        List<List<Integer>> answer = s.permuteUnique(nums);
        System.out.println(answer);

    }
}
