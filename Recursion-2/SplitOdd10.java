
public boolean splitOdd10(int[] nums) {
    return SH(0, nums, 0, 0);
}

public boolean SH(int s, int[] nums, int mult, int odd) {
    if(s >= nums.length)
        return mult % 10 == 0 && odd % 2 == 1;
            
    if(SH(s+1, nums, mult + nums[s], odd))
        return true;
                      
    if(SH(s+1, nums, mult, odd + nums[s]))
        return true;
            return false;
}