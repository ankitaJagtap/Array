class IncreasingTriplet {
    public static boolean increasingTriplet(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            
            for (int j = i + 1; j < n; j++) {
                count = 0;
                if (nums[i] < nums[j]) {
                    count++;
                    for (int k = j + 1; k < n; k++) {
                        if (nums[j] < nums[k]) {
                            count++;
                            if (count >= 2) {
                                break;
                            }
                        }
                    }
                }
                if (count >= 2) {
                        break;
                    }
            }
            if (count >= 2) {
                break;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,0,4,6};
        boolean name = increasingTriplet(arr);
        System.out.println(name);
    }
}