class Solution {
    public String reverseVowels(String s) {
        int first = 0;
        int last = s.length()-1;
        char[] arr = s.toCharArray();
        String vol = "aeiouAEIOU";
        while(first<last){
            if(vol.contains(String.valueOf(arr[first])) && (vol.contains(String.valueOf(arr[last])))){
                char temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
            }
            if(!vol.contains(String.valueOf(arr[first]))) first++;
            if(!vol.contains(String.valueOf(arr[last]))) last--;
        }
        return new String(arr);
        
    }
}