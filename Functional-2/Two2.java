
public List<Integer> two2(List<Integer> nums) {
    nums.replaceAll(s -> s * 2);
    nums.removeIf(s -> s % 10 == 2);
    return nums;
}
  