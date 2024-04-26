/**
 * ContainerWithMostWater
 */
public class ContainerWithMostWater {

    public static int maxArea(int[] nums){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int max = Integer.MIN_VALUE;
        while(left < right){
            int ans = Math.min(nums[left], nums[right]) * (right - left);
            max = Math.max(max, ans);
            if(nums[left] < nums[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    } 

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}