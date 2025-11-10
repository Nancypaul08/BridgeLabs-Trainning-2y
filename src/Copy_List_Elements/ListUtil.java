package Copy_List_Elements;

import java.util.List;

class ListUtil {

    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number num : src) {
            dest.add(num);
        }
    }
}

