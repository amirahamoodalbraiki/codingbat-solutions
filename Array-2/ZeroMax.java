
public int[] zeroMax(int[] nums) {
  int m = 0;
  for(int i = nums.length - 1; i >= 0; i--){
    
    if(nums[i] % 2 != 0) {
       m = Math.max(m, nums[i]);  
    }
    
    if(nums[i] == 0){
      nums[i] = m;
    }
  }
  return nums;
}