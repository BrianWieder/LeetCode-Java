package RangeSumQuery;

public class RangeSumQuery {
    public static void main(String[] args) {
        NumArray na = new NumArray(new int[]{1, 3, 5});
        System.out.println(na.sumRange(0, 2));
        na.update(1, 2);
        System.out.println(na.sumRange(0, 2));
    }
}


class NumArray {
    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums.clone();
    }

    public void update(int i , int val) {
        nums[i] = val;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for(int x = i; x <= j; x++) {
            sum += nums[x];
        }
        return sum;
    }
}