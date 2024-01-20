class ReverseVowels {

    static boolean isVowels(char c){
        return  c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    static void swap(char[] arr, int x, int y){
        char temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (!isVowels(arr[i])) {
                i++;
            } else if (!isVowels(arr[j])) {
                j--;
            } else if (i < j) {
                swap(arr, i++, j--);
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

}