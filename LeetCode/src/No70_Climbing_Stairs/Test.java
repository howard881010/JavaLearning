package No70_Climbing_Stairs;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.climbStairs(4);
        System.out.println(result);

    }
}

class Solution {
    public int climbStairs(int n) {
        int[] a = new int[n + 1];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }
}

