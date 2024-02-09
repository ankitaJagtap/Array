import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintCharWithFrequency {

    public static void printCharWithFrequency(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue() + " ");
        }
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        printCharWithFrequency(str);
    }
}