package CoreJavaCodes.Arrays;

public class RotateArrayRight {
    public static void main(String[] args) {
       /* logic :
                1: reverse entire elements
                2.reverse first k elements
                3. reverse rest element*/

        int arr[]={1,2,4,9,7,6,10};
        int k=3;
        //10 6 7 9 4 2 1
        rotateElementRight(arr,0,arr.length-1);
        rotateElementRight(arr,0,k-1);
        rotateElementRight(arr,k, arr.length-1);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }


    }

    private static int[] rotateElementRight(int[] arr, int i, int i1) {
        while (i<i1)
        {
            int temp=arr[i];
            arr[i]=arr[i1];
            arr[i1]=temp;
            i++;
            i1--;
        }
        return arr;
    }
}
