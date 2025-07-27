
public int[] tenRun(int[] nums) {
  boolean t10 = false;
  int mult = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] % 10 == 0){
      t10 = true;
      mult = nums[i];
    }
    if(t10){
      nums[i] = mult;
    } 
  }
  return nums;
}