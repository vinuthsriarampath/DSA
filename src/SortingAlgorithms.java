public class SortingAlgorithms {

    public static int[] nums = {6, 5, 2, 8, 9, 4};

    public static void main(String[] args) {

        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();

        insertionSort();

        System.out.println();

        System.out.println("after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void bubbleSort() {
        int temp;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length-i-1;j++){

                if(nums[j] > nums[j+1]){

                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }
            }
        }
    }

    /**
     * Sorts the static array `nums` in ascending order using the selection sort algorithm.
     * After each pass, prints the current state of the array to the console.
     * Selection sort works by repeatedly finding the minimum element from the unsorted part
     * and putting it at the beginning.
     */
    private static void selectionSort(){
        int temp;
        int minIndex;

        for (int i = 0 ; i < nums.length; i++){

            minIndex = i;

            for(int j = i+1; j < nums.length; j++){

                // use Grater than or less Than According to the sorting order
                // if you want to sort in descending order, use < instead of >
                // if you want to sort in ascending order, use > instead of <
                // if you want to sort in alphabetical order, use compareTo() method
                // if you want to sort in reverse alphabetical order, use compareTo() method with a
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }

            temp= nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    }
    public static void insertionSort(){

         int key;

         for(int i=1; i<nums.length; i++){

             key = nums[i];
             int j = i - 1;

             while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
             }

             nums[j+1] = key;

             System.out.println();
             for (int num : nums) {
                 System.out.print(num + " ");
             }
         }
    }

    public static void quickSort(){

    }
}
