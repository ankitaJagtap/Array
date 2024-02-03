class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0 || nums.length == 1){
            return nums;
        }
        int count = 1;
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
        Map<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        int[] arr = new int[k];
        int j = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                hashMap.put(nums[i], count);        
                count = 1;
            }else{
                count++;
            }  
        }
        hashMap.put(nums[nums.length-1], count);
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer str, Integer str1) {
                if(str == str1){
                    return 0;
                }else if(str < str1){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
         for (Integer str : list) {
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue().equals(str)) {
                    sortedMap.put(entry.getKey(), str);
                }
            }
        }
        for(Map.Entry<Integer, Integer> entry: sortedMap.entrySet()){
            if(k > 0){
                arr[j++] = entry.getKey();
                k--;
            }
        }
        
        return arr;
    }
}