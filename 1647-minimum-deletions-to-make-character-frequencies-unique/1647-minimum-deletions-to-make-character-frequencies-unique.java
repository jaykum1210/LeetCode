class Solution {
    public int minDeletions(String s) {
        int freq[]=new int[256];
        for(char ch : s.toCharArray())
        freq[ch-'a']++;
        Set<Integer> set=new HashSet<>();
        int res=0;
        for(int f : freq)
        {
            while(f>0 && set.contains(f)){
                f--;
                res++;
            }
            if(f>0) set.add(f);
        }
    return res;
    }
}