package CodingQP;

public class removeDuplicates {
    static int removeDuplicates(int arr[], int n)
    {
        int count=0;
        if (n==0 || n==1)
            return n;

        int []temp = new int[n];


        int j = 0;
        for (int i=0; i<n-1; i++)
        {
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];

        }
        temp[j++] = arr[n-1];


        for (int i=0; i<j; i++)
            arr[i] = temp[i];

        for (int i = 0; i < j; i++) {

            count++;
        }
        System.out.println(count);
        return j;
    }


    public static void main(String[] args) {

        int arr[ ] = { 0,0,1,1,1,2,2,3,3,4};
        int n= arr.length;
        int i,j,temp;
//        for(i=0;i<n;i++)
//        {
//            cin>>arr[i];
//        }

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp  =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        n = removeDuplicates(arr, n);

        for (i=0; i<n; i++)
             System.out.println(arr[i]);

    }
}
