
public boolean double23(int[] nums) {
    int count2 = 0;
    int count3 = 0;
      
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 2)
            count2++;
                        
        if(nums[i] == 3)
            count3++;
    }
                                      
    return count2 == 2 || count3 == 2;
}