class Solution {
    public String generateTheString(int n) {
        String str = "";
        if(n%2==0){
            while(n>1){
                str = str.concat("a");
                n--;
            }
            str = str.concat("z");
        }
        else{
            while(n!=0){
                str = str.concat("a");
                n--;
            }
        }
        return str;
    }
}