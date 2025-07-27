
public int[] withoutTen(int[] nums) {
    int[] array = new int[nums.length];
    int indx = 0;
    
    for(int i = 0; i < nums.length; i++){
      if(nums[i] != 10){
       array[indx] = nums[i];
       indx++;
      }
    }
    
    return array;
}