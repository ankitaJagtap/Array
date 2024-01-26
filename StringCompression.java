class StringCpmpression {
    public static int compress(char[] chars) {
        int n = chars.length;
        StringBuilder str = new StringBuilder();
        String s = new String();
        String str1 = new String();
        if(n == 1){
            str.append(chars[0]);
            str1 = str.toString();
            chars = str1.toCharArray();
        }else if(n > 1){
            int i = 1;
            str.append(chars[0]);
            int count = 1;
            while(i < n){
                if(chars[i-1] != chars[i]){
                    if(count > 1){
                        str.append(count);
                    }
                    str.append(chars[i]);
                    count = 0;
                }
                count++;
                i++;
            }
            if(count > 1){
                str.append(count);
            }
            str1 = str.toString();
            for(int j=0; j<str1.length(); j++){
                chars[j] = str1.charAt(j);
            }
        }
        return str1.length();
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int result = compress(chars);
        System.out.println(result);
    }
}