

public int[] midThree(int[] nums) {
    int[] arrays = new int[3];
    arrays[0] = nums[nums.length / 2 - 1];
    arrays[1] = nums[nums.length / 2];
    arrays[2] = nums[nums.length / 2 + 1];
    return arrays;
}