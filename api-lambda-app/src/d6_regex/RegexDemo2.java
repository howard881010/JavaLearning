package d6_regex;


public class RegexDemo2 {
    public static void main(String[] args) {
        // 只能是 a, b, c
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));

        // 不能是 a, b, c
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));

        System.out.println("a".matches("\\d"));
        System.out.println("3".matches("\\d"));
        System.out.println("333".matches("\\d"));
        System.out.println("z".matches("\\w"));
        System.out.println("2".matches("\\w"));
        System.out.println("21".matches("\\w"));
        System.out.println("你".matches("\\w"));
        System.out.println("妳".matches("\\W"));

        System.out.println("2222fwfwerew".matches("\\w{6,}"));
        System.out.println("222ew".matches("\\w{6,}"));

        System.out.println("23df".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23df".matches("\\w&&[^_]{4}"));










    }
}
