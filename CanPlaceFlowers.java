class CanPlaceFlowers{
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if ((len == 1)) {
            if ((flowerbed[0] == 0) && (n > 0)){
                n--;
                flowerbed[0] = 1;
            }else if((flowerbed[0] == 1) && (n == 0)){
                return true;
            }else if((flowerbed[0] == 0) && (n == 0)){
                return true;
            }else{
                return false;
            }
        }else if(len == 2){
            if((flowerbed[0] == 0) && (flowerbed[1] == 0) && (n>0)){
                n--;
                flowerbed[0] = 1;
            }
        }
        else {
            for (int i = 1; i < len - 1; i++) {
                if ((flowerbed[0] == 0) && (flowerbed[1] == 0)) {
                    if (n > 0) {
                        n--;
                        flowerbed[0] = 1;
                    }
                } else if (flowerbed[i] == 1) {
                    continue;
                } else if ((flowerbed[i - 1] == 0) && (flowerbed[i + 1] == 0)) {
                    if (n > 0) {
                        n--;
                        flowerbed[i] = 1;
                    }

                }
            }
            if((flowerbed[len-2]==0) && (flowerbed[len-1] == 0) && n>0){
                flowerbed[n-1] = 1;
                n--;
            }
        }

        if (n == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr={0,0,0,1,0,0};
        int n=2;
        System.out.println(canPlaceFlowers(arr, n));

    }
}