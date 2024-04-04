class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int count = 0;
        int maximum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='('){
                count++;
            }
            if(count > maximum){
                    maximum = count;
            }
            if(s.charAt(i)==')'){
                count--;
                }
            }
             return maximum;  
    }
        }