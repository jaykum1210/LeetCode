class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length+1];
        for(int e : nums) arr[e]++;
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i<=nums.length;i++){
            if(arr[i]==0) list.add(i);
        }
        return list;
    }
}