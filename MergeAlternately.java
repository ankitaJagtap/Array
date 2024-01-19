class MergeAlternately {
    public static String mergeAlternately(String word1, String word2) {
        String S = "";
        int min = 0;
        int i = 0;
        if(word1.length() < word2.length()){
            min = word1.length();
        }else{
            min = word2.length();
        }
        
        StringBuilder str = new StringBuilder();
        for(i=0; i<min; i++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }
        if(word1.length() > word2.length()){
            while(min < word1.length()){
                str.append(word1.charAt(min));
                min++;
            }
        }else{
            while(min < word2.length()){
                str.append(word2.charAt(min));
                min++;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "abc";
        String l = "pqr";
        String res = mergeAlternately(s,l);
        System.out.println(res);
    }

}
