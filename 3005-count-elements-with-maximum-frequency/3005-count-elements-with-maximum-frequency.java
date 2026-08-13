class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxfrequency = 0;
        int total = 0;
        for(int e : nums) map.put(e,map.getOrDefault(e,0)+1);
        for(int key : map.keySet()){
            if(map.get(key)==maxfrequency){
                total+=map.get(key);
            }
            else if(map.get(key)>maxfrequency){
                maxfrequency = map.get(key);
                total = maxfrequency;
            }
            
        }
        return total;
    }
}