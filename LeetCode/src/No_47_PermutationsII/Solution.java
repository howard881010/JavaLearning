package No_47_PermutationsII;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUniQue(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        generatePermutation(nums, permutation, used, result);
        return result;


    }

    private void generatePermutation(int[] nums, List<Integer> permutation, boolean[] used, List<List<Integer>> result) {
        if (permutation.size() == nums.length && !result.contains(permutation)) {
            result.add(new ArrayList<>(permutation));
        }
        System.out.println(permutation);
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                permutation.add(nums[i]);
                used[i] = true;
                generatePermutation(nums, permutation, used, result);
                used[i] = false;
                permutation.remove(permutation.size() - 1);
            }
        }
    }
}
