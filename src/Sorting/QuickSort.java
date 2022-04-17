package Sorting;

public class QuickSort {

    public static void main(String[] args) {
        int [] arr = {4,5,7,6,9,2,3,5};
        int n=arr.length;
        quickSort(arr, 0 , n-1);
        for (int i = 0; i < n ; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    static void swap(int []arr, int i,int j)
    {
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }

    static int partition(int [] arr, int low ,int high)
    {
        int pivote = arr[high];
        int i=-1;
        for (int j = 0; j < high; j++) {

            if(arr[j] < pivote)
            {
                i++;
                swap(arr, i , j);
            }
        }
        i++;
        swap(arr,i,high);
        return i;
    }

    static void quickSort(int []arr , int low , int high)
    {
        if(low < high)
        {
            int pivote = partition(arr , low , high);

            quickSort(arr,low,pivote-1);
            quickSort(arr,pivote+1,high);
        }
    }

}
