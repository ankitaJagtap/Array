import java.lang.*;
import java.util.*;

class KidsWiththeGreatestNumberofCandies{

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List list = new ArrayList<Boolean>();
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }  


    public static void main(String[] args) {
        int[] candies = {2,5,3,2,1};
        int extraCandies = 3;
        List<Boolean> as = kidsWithCandies(candies, extraCandies);
        System.out.println(as);
    }
}