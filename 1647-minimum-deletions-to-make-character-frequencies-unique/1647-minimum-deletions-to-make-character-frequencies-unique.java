class Solution {
    public int minDeletions(String s) {
        int[] arr = new int[26];
        for(int i = 0;i<s.length();i++) arr[s.charAt(i)-'a']++;
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int e : arr){
            if(!set.contains(e)) set.add(e);
            else{
                while(e>0 && set.contains(e)){
                    e--;
                    count++;
                }
                if(e>0) set.add(e);
            }
        }
        return count;
    }
}