package No_67_ADD_Binary;

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int len = a.length() > b.length() ? a.length() + 1 : b.length() + 1;
        int count = 0;
        int number = 0;
        for (int i = len - 1; i >= 0; i--) {
            number = 0;
            number += count;
            if (i - (len - a.length()) >= 0) {
                number += a.charAt(i - (len - a.length())) - '0';
            }
            if (i - (len - b.length()) >= 0) {
                number += b.charAt(i - (len - b.length())) - '0';
            }
            if (number >= 2) {
                count = 1;
                number -= 2;
            } else {
                count = 0;
            }
            if (i == 0 && number == 0){

            }else{
                sb.append(number);
            }

        }
        return sb.reverse().toString();



    }
}
