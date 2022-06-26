class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length, totalSum = 0, minSubarray = 0;

	for (int i=0, currSum=0; i<n; i++) {
		totalSum = totalSum+ cardPoints[i];
		currSum = currSum+ cardPoints[i];
		if (i < n-k) 
            minSubarray = minSubarray+cardPoints[i];
		else {
			currSum = currSum-cardPoints[i-(n-k)];
			minSubarray = Math.min(minSubarray, currSum);
		}
	}

	return totalSum - minSubarray;
    }
}