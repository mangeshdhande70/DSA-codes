public class Binary_Search {

    public static void main(String[] args) {

        // For Ascending Array
        // int [] arr = {1,2,3,4,5,6,7,8,9};
        // System.out.println(AscendingBinSearch(arr , 9 ,0,arr.length-1));

        //  For Descending Array
        int [] arr = {1,2,3,4,7,8,2,1};

         System.out.println(peak(arr));
       // System.out.println(descendingBinSearch(arr , 9 , 0,arr.length-1));
    }

//    static int mountainArr(int [] arr , int target , int start , int end)
//    {
//
//    }

    static int AscendingBinSearch(int [] arr , int target , int start , int end) {
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (arr[mid] == target) return mid;

            if (arr[mid] > target) return AscendingBinSearch(arr, target, start, mid - 1);

            if (arr[mid] < target) return AscendingBinSearch(arr, target, mid+1, end);

        }
        return -1;
    }

    static int descendingBinSearch(int [] arr , int target , int start , int end)
    {
        int mid = start + (end - start)/2;
        while (start <= end)
        {
            if(arr[mid] == target) return mid;

            if (arr[mid] > target) return descendingBinSearch(arr, target, start+1, end);

            if (arr[mid] < target) return descendingBinSearch(arr, target, start, mid-1);
        }
        return -1;

    }

    static int peak(int [] arr)
    {
        int start = 0 , end = arr.length-1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return arr[start];
    }

}
