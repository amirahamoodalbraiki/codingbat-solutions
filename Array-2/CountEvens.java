public int countEvens(int[] nums) {
  int c = 0;
  for(int item : nums){
    if(item % 2 == 0){
      c += 1;
    }
  }
  return c;
}