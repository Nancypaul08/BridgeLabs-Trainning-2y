package Copy_List_Elements;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> srcList = Arrays.asList(10, 20, 30); // Source list
        List<Number> destList = new ArrayList<>();         // Destination list

        ListUtil.copyList(destList, srcList);

        System.out.println("Destination List after copy: " + destList);

        // Another test with Double list
        List<Double> srcDouble = Arrays.asList(1.5, 2.5, 3.5);
        List<Object> destObject = new ArrayList<>();

        ListUtil.copyList(destObject, srcDouble);
        System.out.println("Object List after copy: " + destObject);
    }
}

