class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> OuterList = new ArrayList<>();

        HashMap<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] ch = s.toCharArray();

            Arrays.sort(ch);

            String temp = new String(ch);

            if(map.containsKey(temp)){
                map.get(temp).add(s);
            }
            else{
                map.put(temp,new ArrayList<>());
                map.get(temp).add(s);
            }
        }

        for(List<String> list : map.values()){
            OuterList.add(list);
        }

        return OuterList;
    }
}