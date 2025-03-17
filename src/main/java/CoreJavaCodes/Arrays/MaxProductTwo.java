package CoreJavaCodes.Arrays;

public class MaxProductTwo {
    public static void main(String[] args) {
        int [] a={2,5,7,9,8,1};
        int max=0;
        //max=findMaxOddProduct(a);
        max=findMaxOddProduct2ND(a);

        System.out.println(max);
    }

    private static int findMaxOddProduct2ND(int[] a) {
        int max=0;
        int max1=0,max2=0;
        for(int j=0;j<a.length;j++)
        {
           if(a[j]>max1)
           {
               max2=max1;//m2=0-2-5-7
               max1=a[j];//m1=2-5-7-9
           }
           else if(a[j]>max2)
           {
               max2=a[j];
           }
        }
        return max1*max2;
    }

    private static int findMaxOddProduct(int[] a) {
        int max=0;
        for (int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                int x=a[i]*a[j];
                if(max<x)
                {
                    max=x;
                }
            }
        }
        return max;
    }


}
