
public int[] post4(int[] nums) {
  int indx = 0;
  for( int i =0; i < nums.length; i++){
    if(nums[i] == 4){
      indx = i + 1;
    }
  }
  int[] array = new int[nums.length-indx];
  for(int i = 0; i < nums.length - indx; i++){
    array[i] = nums[i+indx];
  }
  return array;
}
  