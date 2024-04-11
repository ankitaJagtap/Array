import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateInArray {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int repeatedNumber(final List<Integer> A) {
        int n = A.size();
        int slow = A.get(0);
        int fast = A.get(0);
        do {
            slow = A.get(slow);
            fast = A.get(A.get(fast));
        } while (slow != fast);

        fast = A.get(0);
        while (slow != fast) {
            slow = A.get(slow);
            fast = A.get(fast);
        }
        return slow;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(4);
        System.out.println(repeatedNumber(list));
    }
}
