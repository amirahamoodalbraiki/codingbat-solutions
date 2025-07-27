
public boolean canBalance(int[] nums) {
    int frst = 0;
    int scnd= 0;
      
    for(int i = 0; i < nums.length; i++)
        scnd += nums[i];
              
    for(int i = 0; i <= nums.length - 2; i++) {
        frst += nums[i];
        scnd -= nums[i];
                            
        if(frst == scnd)
            return true;
    }
                                          
    return false;
}