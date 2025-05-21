class Solution8 {
    public void rotate(int[] nums, int k) {
      k=k%nums.length;
      r(nums,0,nums.length-1);
      r(nums,0,k-1);
      r(nums,k,nums.length-1);

    }
    public void r(int nums[],int s,int e){
        while(s<e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }
    }
}
