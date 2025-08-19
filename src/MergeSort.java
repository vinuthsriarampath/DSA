import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {3,5,1,4,6,2};

        for (int n:arr){
            System.out.print(n + " ");
        }

        System.out.println();

        mergeSort(arr, 0, arr.length-1);

        System.out.println("After Merge Sort");

        for (int n:arr){
            System.out.print(n + " ");
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l<r){
            int mid = (l + r)/2;

            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);

            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {

        int n1 = mid - l +1;
        int n2 = r - mid;


        int[] lArray = new int[n1];
        int[] rArray = new int[n2];

        for (int x=0; x<n1; x++){
            lArray[x] = arr[l + x];
        }
        for (int x=0; x<n2; x++){
            rArray[x] = arr[mid+1 + x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i < n1 && j < n2) {
            if (lArray[i] <= rArray[j]) {
                arr[k] = lArray[i];
                i++;
            } else {
                arr[k] = rArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = lArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rArray[j];
            j++;
            k++;
        }
    }
}
