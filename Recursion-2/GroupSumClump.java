
public boolean groupSumClump(int start, int[] nums, int target) {
    if(start >= nums.length)
        return target == 0;
          
    int i = start;
    int s = 0;
    
    while(i < nums.length && nums[start] == nums[i]) {
        s += nums[i];
        i++;
    }
    if(groupSumClump(i, nums, target - s))
        return true;
                                        
    if(groupSumClump(i, nums, target))
        return true;
                                                  
    return false;
}