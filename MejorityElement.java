import java.lang.*;
import java.util.*;

/**
 * MejorityElement
 */
public class MejorityElement {

    public static int majorityElement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int key = 0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,3,4,4};
        System.out.println(majorityElement(arr));
    }
}