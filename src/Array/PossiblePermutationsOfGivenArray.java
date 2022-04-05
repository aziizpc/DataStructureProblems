package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PossiblePermutationsOfGivenArray {

	public static void main(String[] args) throws Exception {
		int[] nums1 = { 1, 2, 3, 4 };
		System.out.println("\nOriginal array: " + Arrays.toString(nums1));
		List<List<Integer>> result1 = new PossiblePermutationsOfGivenArray().permute(nums1);
		System.out.println("\nPossible permutations of the said array:");
		result1.forEach(System.out::println);
		int[] nums2 = { 1, 2, 3 };
		System.out.println("\nOriginal array: " + Arrays.toString(nums2));
		List<List<Integer>> result2 = new PossiblePermutationsOfGivenArray().permute(nums2);
		System.out.println("\nPossible permutations of the said array:");
		result2.forEach(System.out::println);
	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Permutation(0, nums, result);
		return result;
	}

	private void Permutation(int i, int[] nums, List<List<Integer>> result) {
		if (i == nums.length - 1) {
			List<Integer> list = new ArrayList<>();
			for (int n : nums)
				list.add(n);
			result.add(list);
		} else {
			for (int j = i, l = nums.length; j < l; j++) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				Permutation(i + 1, nums, result);
				temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
			}
		}
	}
}