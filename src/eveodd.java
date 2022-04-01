import java.util.Arrays;

public class eveodd {
    public static void main(String[] args) {

        int [] arr ={3,7,11,12,1,2,4,3,5,6};
        fun(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int [] arr ,int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void fun(int [] arr)
    {
        int i=0,j=arr.length-1;
        while (i<j) {
            while (arr[i] % 2 == 0) i++;
            while (arr[j] % 2 != 0) j--;
            if(i<j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
    }
}
