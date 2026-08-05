class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[nums1.length];
        int a = 0, b = 0, x = 0;
        while(a<m && b<n){
            if(nums1[a]<nums2[b]) arr[x++] = nums1[a++];
            else arr[x++] = nums2[b++];
        }
        while(a<m) arr[x++] = nums1[a++];
        while(b<n) arr[x++] = nums2[b++];
        for(int i = 0;i<nums1.length;i++) nums1[i] = arr[i];
    }
}