import java.util.Scanner;

class FindStringLength {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        int customLength = getLength(text);
        int builtInLength = text.length();
        System.out.println("Custom length: " + customLength);
        System.out.println("Built-in length: " + builtInLength);
    }
}
