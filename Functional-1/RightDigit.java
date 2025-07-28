
public List<Integer> rightDigit(List<Integer> nums) {
  nums.replaceAll(n -> Math.abs(n) % 10);
  return nums;
}