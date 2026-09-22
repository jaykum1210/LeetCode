class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 1;
        for(int i = digits.length-1;i>=0;i--){
            int sum = digits[i] + carry;
            int num = sum%10;
            carry = sum/10;

            list.add(0,num);
        }
        if(carry>0){
            list.add(0,carry);
        }

        int[] result = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}