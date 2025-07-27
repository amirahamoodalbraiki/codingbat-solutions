
public boolean haveThree(int[] nums) {
  int c = 0;
    
  if(nums.length > 1 && nums[0] == 3){
    c += 1;
  }
    
  for(int i = 1; i < nums.length; i++){
    if(nums[i-1] == 3 && nums[i] == 3){
      return false;
    }
    if(nums[i] == 3){
      c += 1;
    }
  }
  return c == 3;
}
  