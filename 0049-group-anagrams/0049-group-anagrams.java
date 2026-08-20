class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> OuterList = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String e : strs){
            char[] c = e.toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(map.containsKey(s)){
                map.get(s).add(e);
            }
            else{
                map.put(s,new ArrayList<>());
                map.get(s).add(e);
            }
        }
        for(String key : map.keySet()){
            OuterList.add(map.get(key));
        }
        return OuterList;
    }
}