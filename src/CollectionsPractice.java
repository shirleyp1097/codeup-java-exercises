import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CollectionsPractice {

    public static ArrayList<Integer> omit2(ArrayList<Integer> input) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int elem: input) {
            if (elem == 2) {

            } else {
                newList.add(elem);
            }
        }
        return newList;
    }

    public static HashMap<String, String> createMap(List<String> keys, List<String> values) {
        HashMap<String, String> returnMap = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            returnMap.put(keys.get(i), values.get(i));
        }
        return returnMap;
    }
    public static void main(String[] args) {
//        ArrayList<Integer> first = new ArrayList<>();
//        first.add(1);
//        first.add(2);
//        first.add(3);
//        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1,2,3));
//        System.out.println(first);
//        System.out.println(omit2(first));
//        System.out.println(second);
//        System.out.println(omit2(second));
        List<String> keys = new ArrayList<>(Arrays.asList(
                "first key",
                "second key",
                "third key",
                "fourth key"
        ));

        List<String> values = new ArrayList<>(Arrays.asList(
                "first value",
                "second value",
                "third value",
                "fourth value"
        ));
        System.out.println(createMap(keys, values));
    }
}
