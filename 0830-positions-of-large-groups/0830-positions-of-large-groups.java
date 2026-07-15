class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> outer = new ArrayList<>();
        int start = 0;
        for(int i = 1;i<=s.length();i++){
            if(i==s.length() || s.charAt(start)!=s.charAt(i)){
                if(i-start>=3){
                    List<Integer> inner = new ArrayList<>();
                    inner.add(start);
                    inner.add(i-1);
                    outer.add(inner);
                }
                start = i;
            }
        }
        return outer;
    }
}