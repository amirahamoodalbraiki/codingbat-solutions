
public int[] fix45(int[] nums) {
    int a = 0;
    int b = 0;
        
    while(b < nums.length && nums[b] != 5)
        b++;
                  
    while(a < nums.length) {
        if(nums[a] == 4) {
            int temp = nums[a+1];
            nums[a+1] = nums[b];
            nums[b] = temp;

            while((b < nums.length && nums[b] != 5) || b == a + 1)
                b++;
        }
        a++;
    }
    return nums;
}