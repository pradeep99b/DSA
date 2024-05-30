import java.util.HashSet;

public class UniqueSubsequence {

    static void sub(String str, String res, HashSet<String> hs) {
        hs.add(res);
        int n = str.length();
        
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                sub(str.substring(i + 1, n), res + str.charAt(i), hs);
            }
        }
    }

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        sub("aab", "", hs);
        System.out.println(hs);
    }
}
