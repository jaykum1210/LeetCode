class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length==0 || nums2.length==0) return new int[]{};
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int e : nums1) map.put(e,map.getOrDefault(e,0)+1);
        for(int e : nums2){
            if(map.containsKey(e)){
                list.add(e);
                map.put(e, map.get(e) - 1);
                if(map.get(e) == 0) map.remove(e);
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}