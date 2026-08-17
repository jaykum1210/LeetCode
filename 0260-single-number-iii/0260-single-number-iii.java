class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int e : nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        int[] arr = new int[2];
        int x = 0;
        for(int e : map.keySet()){
            if(map.get(e)==1) arr[x++] = e;
        }
        return arr;
    }
}