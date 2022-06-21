class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int building = 1; building < n; building++) {
            int heightDifference = heights[building] - heights[building - 1];
            if (heightDifference > 0) {
                if (pq.size() < ladders) pq.add(heightDifference);
                else {
                    int bricksToBeUsed = heightDifference;
                    if (!pq.isEmpty() && pq.peek() < heightDifference) {
                        bricksToBeUsed = pq.poll();
                        pq.add(heightDifference);
                    }

                    if (bricks - bricksToBeUsed >= 0) bricks -= bricksToBeUsed;
                    else return building - 1;
                }
            }

        }
        
        return n - 1;
}
}