package d11_api_StringBuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append(1);
        sb.append(false);

        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();
        // 支持鏈式編成
        sb1.append("a").append('b');
        sb1.reverse().append(110);
        System.out.println(sb1);
        System.out.println(sb1.length());
        // 最終結果還是要恢復為String
        String rs = sb1.toString();
    }
}
