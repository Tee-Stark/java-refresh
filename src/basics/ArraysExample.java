package basics;

public class ArraysExample {
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5};
		
		for(int i = 0; i <= nums.length; i++) {
			// System.out.println(nums[i]);
			System.out.println(i);
		}
		for(int i = 0; i <= nums.length; ++i) {
			// System.out.println(nums[i]);
			System.out.println(i);
		}
		
		// for each loop
//		for(int num : nums) {
//			System.out.println(num);
//		}
//		
		// multidimensional arrays use [][] -- note: just like CPP. We move!
	}
}