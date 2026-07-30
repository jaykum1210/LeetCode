class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int e : stones) pq.add(e);

        while(pq.size()>1){
            int y = pq.poll();
            int x = pq.poll();
            if(y!=x) pq.add(y-x);
        }
        return pq.isEmpty()?0:pq.peek();
    }
}