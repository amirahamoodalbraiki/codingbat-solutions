
public int[] zeroFront(int[] nums) {
  int[] array = new int[nums.length];
  int indx = nums.length-1;
  for(int i = 0; i < nums.length; i++){
      
    if(nums[i] != 0){
      array[indx] = nums[i];
      indx--;
    }
      
  }
  return array;
}
  