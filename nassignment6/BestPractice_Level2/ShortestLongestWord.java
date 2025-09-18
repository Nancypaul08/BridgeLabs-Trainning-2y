import java.util.Scanner;

class ShortestLongestWord {
    public static String[] splitWordsCustom(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }
        String[] words = new String[count];
        int start = 0, idx = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = text.substring(start);
        return words;
    }

    public static String findShortest(String[] words) {
        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
        }
        return shortest;
    }

    public static String findLongest(String[] words) {
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] words = splitWordsCustom(text);
        System.out.println("Shortest: " + findShortest(words));
        System.out.println("Longest: " + findLongest(words));
    }
}
