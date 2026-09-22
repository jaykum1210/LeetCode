class Solution {
    public String addBinary(String a, String b) {
        int indexA = a.length()-1;
        int indexB = b.length()-1;

        int carry = 0;

        StringBuilder str = new StringBuilder();

        while(indexA>=0 && indexB>=0){
            int num1 = a.charAt(indexA) - '0';
            int num2 = b.charAt(indexB) - '0';

            int sum = num1 + num2 + carry;

            int val = sum%2;
            carry = sum/2;

            str.insert(0,val);

            indexA--;
            indexB--;
        }

        while(indexA>=0){
            int num1 = a.charAt(indexA) - '0';

            int sum = num1 + carry;

            int val = sum%2;
            carry = sum/2;

            str.insert(0,val);

            indexA--;
        }

        while(indexB>=0){
            int num2 = b.charAt(indexB) - '0';

            int sum = num2 + carry;

            int val = sum%2;
            carry = sum/2;

            str.insert(0,val);

            indexB--;
        }

        if(carry!=0){
            str.insert(0,carry);
        }

        return str.toString();
    }
}