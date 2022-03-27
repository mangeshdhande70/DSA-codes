public class Binary_Search {

    public static void main(String[] args) {


        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(AscendingBinSearch(arr , 9 ,0,arr.length-1));

    }


    static int AscendingBinSearch(int [] arr , int target , int start , int end) {
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (arr[mid] == target) return mid;

            if (arr[mid] > target) return AscendingBinSearch(arr, target, start, mid - 1);

            if (arr[mid] < target) return AscendingBinSearch(arr, target, mid+1, end);

        }
        return -1;
    }

}
