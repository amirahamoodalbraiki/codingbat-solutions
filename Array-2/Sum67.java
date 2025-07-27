
public int sum67(int[] nums) {
    int summ = 0;
    boolean s6 = false;
    for(int i = 0; i < nums.length; i++){
      if(nums[i] == 6){
        s6 = true;
      } 
    
      if(!s6){
        summ += nums[i];
      }
      
      if(nums[i] == 7){
        s6 = false;
      }
      
    }
    return summ;
  }
  