package d6_regex;

public class RegexDemo4 {
    public static void main(String[] args) {
        String names = "我jiwerjewirjwi曖keoekqoekos你";
        String[] arrs = names.split("\\w+");
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }

        String names2 = names.replaceAll("\\w+", "  ");
        System.out.println(names2);
    }
}
