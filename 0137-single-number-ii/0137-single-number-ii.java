class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int e : nums) map.put(e,map.getOrDefault(e,0)+1);
        for(int e : map.keySet()){
            if(map.get(e)!=3) return e;
        }
        return 0;
    }
}