class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(p.length()>s.length()) return list;
        int[] sArray = new int[26];
        int[] pArray = new int[26];
        for(int i = 0;i<p.length();i++){
            pArray[p.charAt(i)-'a']++;
            sArray[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pArray,sArray)) list.add(0);
        int l = 0;
        for(int r = p.length();r<s.length();r++){
            sArray[s.charAt(r)-'a']++;
            sArray[s.charAt(l)-'a']--;
            l++;
            if(Arrays.equals(pArray,sArray)) list.add(l);
        }
        return list;
    }
}