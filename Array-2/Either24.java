
public boolean either24(int[] nums) {
  boolean T = false;
  boolean F = false;
  for(int i = 0; i < nums.length -1; i++){
    if(nums[i] == 2 && nums[i + 1] == 2) {
      T = true;
    }  
    if (nums[i] == 4 && nums[i+1] == 4){
      F = true;
    }
  }
  if(T && F){
    return false;
  } else if (T || F) {
    return true;
  } else {
    return false;
  }
}
  