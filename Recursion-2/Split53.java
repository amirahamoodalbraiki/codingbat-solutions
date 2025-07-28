
public boolean split53(int[] nums) {
    return SH(0, nums, 0, 0);
}

public boolean SH(int start, int[] nums, int mult5, int mult3) {
    if(start >= nums.length)
        return mult5 == mult3;
    if(nums[start] % 5 == 0)
        return SH(start+1, nums, mult5 + nums[start], mult3);
                      
    if(nums[start] % 3 == 0)
        return SH(start+1, nums, mult5, mult3 + nums[start]);
    if(SH(start+1, nums, mult5 + nums[start], mult3))
        return true;
    if(SH(start+1, nums, mult5, mult3 + nums[start]))
        return true;
    return false;
}