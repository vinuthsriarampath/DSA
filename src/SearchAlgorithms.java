public class SearchAlgorithms {
    public static void main(String[] args) {
        int[] nums = {5,7,9,11,13,15,17,19,21,23,25};
        int target = 13;

        int result = binarySearch(nums,target,0, nums.length-1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    /**
     * Performs a linear search on the given array to find the target element.
     *
     * @param nums   The array of integers to search through.
     * @param target The integer value to search for in the array.
     * @return The index of the target element if found; -1 if the target is not in the array.
     */
    public static int linearSearch(int[] nums, int target) {
        for(int i = 0; 1<nums.length-1; i++){
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a binary search on a sorted array to find the target element.
     *
     * @param nums   The sorted array of integers to search through.
     * @param target The integer value to search for in the array.
     * @param left   The starting index of the current search range.
     * @param right  The ending index of the current search range.
     * @return The index of the target element if found; -1 if the target is not in the array.
     */
    public static int binarySearch(int[] nums, int target,int left,int right) {

//        Option 1: Recursive Binary Search

//        int left = 0;
//        int right = nums.length - 1;

//        while (left<=right){
//            int mid = (left+right)/2;
//            if(nums[mid] == target) {
//                return mid;
//            } else if(nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return -1;

//        Option 2

        if (left > right) {
            return -1; // Base case: target not found
        }

        int mid = (left + right) / 2;

        if (nums[mid] == target) {
            return mid; // Target found
        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, right); // Search in the right half
        } else {
            return binarySearch(nums, target, left, mid - 1); // Search in the left half
        }
    }
}
