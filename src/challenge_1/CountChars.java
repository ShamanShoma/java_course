package challenge_1;

public class CountChars {
    void main() {

        String text = "HELLOWORLD";
        int[] result = countChars(text);
        int lcount = result['O' - 'A'];
        System.out.println(lcount);

    }

    private int[] countChars(String s) {
        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount[c - 'A']++;

        }

        return charCount;
    }
}
