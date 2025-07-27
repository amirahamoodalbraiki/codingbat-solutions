
public int bigDiff(int[] nums) {
 int max = findMax(nums);
 int min = findMin(nums);
 return max - min;
}
public int findMax(int[] nums) {
  int maxi = nums[0];
  for (int i=1; i<nums.length; i++) {
    if (nums[i] > maxi) {
      maxi = nums[i];
    }
  }
  return maxi;
}

public int findMin(int[] nums) {
  int mini = nums[0];
  for (int i=1; i<nums.length; i++) {
    if (nums[i] < mini) {
      mini = nums[i];
    }
  }
  return mini;
}