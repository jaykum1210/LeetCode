class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int maxval = Integer.MIN_VALUE;
        int maxindex = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval = arr[i];
                maxindex = i;
            }
        }
        return maxindex;
    }
}