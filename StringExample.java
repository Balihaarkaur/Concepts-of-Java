public class StringExample {
    public static void main(String[] args) {
        String s = "Hello";
        char c = s.charAt(1);
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}
