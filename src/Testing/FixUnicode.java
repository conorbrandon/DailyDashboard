package Testing;

public class FixUnicode {
    public static void main(String[] args) {
        String string = "\u2018Get Over It\u2019? Why Political Influence in Foreign Policy Matters";
        System.out.println(string);
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            result += string.charAt(i);
        }
        System.out.println(string);
    }
}
