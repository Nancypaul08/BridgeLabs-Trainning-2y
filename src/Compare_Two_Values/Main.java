package Compare_Two_Values;

public class Main {
    public static void main(String[] args) {

        System.out.println(CompareUtil.isEqual(10, 10));       // true
        System.out.println(CompareUtil.isEqual("Hello", "Hi")); // false
        System.out.println(CompareUtil.isEqual(5.5, 5.5));      // true
    }
}

