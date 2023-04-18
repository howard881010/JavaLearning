package No_43_Medium;

public class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length(), m = num2.length();
        if (num1.equals("0")  || num2.equals("0")) {
            return "0";
        }
        int[] res = new int[n + m];
        for (int i = 0; i < n; i++) {
            int x = num1.charAt(i) - '0';
            for (int j = 0; j < m; j++) {
                int y = num2.charAt(j) - '0';
                res[i + j] += x * y;
            }
        }
        for (int i = res.length - 1; i >= 1; i--) {
            res[i] = res[i-1];
        }
        int count = 0;
        res[0] = 0;
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] += count;
            count = res[i] / 10;
            res[i] %= 10;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            if (sb.length() == 0 && res[i] == 0) continue;
            sb.append(res[i]);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}

