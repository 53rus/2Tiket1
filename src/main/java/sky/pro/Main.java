package sky.pro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"a", "a", "b", "b", "c", "c", "a"};
        List<String> stringList = new ArrayList<>();
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < arr.length ; i++) {
            if (!stringList.contains(arr[i])) {
                stringList.add(arr[i]);
                string.append(arr[i]);
            }
        }
        System.out.println(string);
        System.out.println(stringList);
    }
}