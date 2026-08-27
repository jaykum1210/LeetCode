class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[26];
        for(int i = 0;i<p.length();i++){
            arr[p.charAt(i)-'a']++;
        }
        for(int i = 0;i<=s.length()-p.length();i++){
            String str = s.substring(i,i+p.length());
            int[] arr2 = new int[26];
            for(int j = 0;j<str.length();j++){
                arr2[str.charAt(j)-'a']++;
            }
            if(Arrays.equals(arr, arr2)) list.add(i);
        }
        return list;
    }
}