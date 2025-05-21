class Solution6 {
    public int maxSubArray(int[] nums) {
    int curSum=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        int temp=curSum+nums[i];
        if(temp<nums[i]){
            curSum=nums[i];
        }
        else{
            curSum=temp;
        }
        if(maxSum<curSum){
            maxSum=curSum;
        }
    } 
    return maxSum;   
    }
}