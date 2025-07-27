
public boolean twoTwo(int[] nums) {
  for(int i = 0; i < nums.length; i++){
    int c = 0;
    while(i < nums.length && nums[i] == 2){
      c++;
      i++;
    }
    if(c == 1){
      return false;
    }
  }
  return true;
}