class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        int[] arr = new int[m+n];

        for(int i = num1.length()-1;i>=0;i--){
            for(int j = num2.length()-1;j>=0;j--){
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';

                int mul = a*b;

                int position1 = i+j;
                int position2 = i+j+1;

                int sum = mul + arr[position2];

                arr[position2] = sum%10;
                arr[position1] +=sum/10;
            }
        }

        StringBuilder str = new StringBuilder();

        for(int e : arr){
            if(str.length() == 0 && e==0){
                continue;
            }
            str.append(e);
        }

        return str.toString();
    }
}