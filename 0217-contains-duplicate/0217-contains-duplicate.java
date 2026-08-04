class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int e : nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)!=1) return true;
        }
        return false;
    }
}