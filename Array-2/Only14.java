
public boolean only14(int[] nums) {
  boolean m = Arrays.stream(nums).allMatch(n -> n == 1 || n == 4);
  if(m){
    return true;
  } else {
    return false;
  }
}