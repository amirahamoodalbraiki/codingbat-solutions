
public boolean more14(int[] nums) {
  int one = 0;
  int four = 0;
  for(int num : nums){
    if(num == 1){
      one += 1;
    } else if(num == 4){
      four += 1;
    }
  }
  if(one > four){
    return true;
  } else {
    return false;
  }
}