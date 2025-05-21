class Solution1 {
    public int removeDuplicates(int[] nums) {
       int indexForNextNumber=1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1]){
            nums[indexForNextNumber]=nums[i];
            indexForNextNumber++;
        }
       } 
       return indexForNextNumber;
    }
}