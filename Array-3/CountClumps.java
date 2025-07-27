public int countClumps(int[] nums) {
    int cnt = 0;
    int i = 0;
      
    while(i < nums.length) {
        int val = nums[i];
        i++;
        int length = 1;
        while(i < nums.length && nums[i] == val) {
            i++;
            length++;
        }
                                            
        if(length > 1)
            cnt++;
    }
                                                          
    return cnt;
}