class Solution {
    public int maxScore(int[] cardPoints, int k) {
        long sum = 0;
        for(int i = cardPoints.length-1;i>=cardPoints.length-k;i--){
            sum+=cardPoints[i];
        }
        long max = sum;
        int x = 0;
        int y = cardPoints.length-k;
        for(int i = 0;i<k;i++){
            sum+=cardPoints[x];
            sum-=cardPoints[y];
            max = Math.max(max,sum);
            x++;
            y++;
        }
        return (int)max;
    }
}