class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[k];
        int x = 0;
        for(int e : nums) map.put(e,map.getOrDefault(e,0)+1);
        while(k!=0){
            int maxval = Integer.MIN_VALUE;
            int maxfr = 0;
            for(int key : map.keySet()){
                if(map.get(key)>maxfr){
                    maxval = key;
                    maxfr = map.get(key);
                }
            }
            arr[x++] = maxval;
            k--;
            map.remove(maxval);
        }
        return arr;
    }
}