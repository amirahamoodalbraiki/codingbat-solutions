
public int[] pre4(int[] nums) {
  int c = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 4){
      break;
    }
    c++;
  }
  int[] array = new int[c];
  for(int i = 0; i < c; i++){
    array[i] = nums[i];
  }
  return array;
}
  