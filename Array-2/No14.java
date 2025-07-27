
public boolean no14(int[] nums) {
    boolean m = Arrays.stream(nums).anyMatch(n -> n == 1 );
    boolean m2 = Arrays.stream(nums).anyMatch(n -> n == 4);
    if(m &m& m2){
      return false;
    }
  return true;
}