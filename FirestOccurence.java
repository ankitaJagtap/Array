class Solution {
    public int FirestOccurence(String haystack, String needle) {
        int s1 = haystack.length();
        int s2 = needle.length();
        if (s1 < s2) {
            return -1;
        } else {
            int i = 0;
            int len = s1 - s2;

            while (i <= len) {
                int j = 0;
                if (haystack.charAt(i) == needle.charAt(j)) {
                    int temp = i;
                    boolean flag = true;
                    while (j < s2) {
                        if (haystack.charAt(temp) == needle.charAt(j)) {
                            temp++;
                            j++;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                    if (flag == true) {
                        return i;
                    }
                }
                i++;
            }
            return -1;
        }
    }
}