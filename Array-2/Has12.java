
public boolean has12(int[] nums) {
  boolean indx = false;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 1){
      indx = true;
    }
    if(indx && nums[i] == 2){
        return true;
      } 
    }
  return false;
}