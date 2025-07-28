
public int[] copyEndy(int[] nums, int count) {
    int[] arr = new int[count];
    int index = 0;
      
    for(int i = 0; index < count; i++) {
        if(islast(nums[i])) {
            arr[index] = nums[i];
            index++;
        }
    }
                                
    return arr;
}

public boolean islast(int n) {
    return 0 <= n && n <= 10 || 90 <= n && n <= 100;
}