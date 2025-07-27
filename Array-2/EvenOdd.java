
public int[] evenOdd(int[] nums) {
  int[] array = new int[nums.length];
  int eveIn = 0;
  int odIndx = nums.length-1;
    
  for(int i = 0; i < nums.length; i++){
    if(nums[i] % 2 == 0){
      array[eveIn] = nums[i];
      eveIn++;
    } else {
      array[odIndx] = nums[i];
      odIndx--;
    }
  }
    
  return array;
}
   