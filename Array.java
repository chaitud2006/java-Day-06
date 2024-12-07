import java.util.*;
public class Array
{
    public static void main(String args[])
    {
        int arr[]={22,44,565,789,200};
        System.out.println(Arrays.toString(arr));
        //Accessing of array elements
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //Modification of array elements
        arr[2]=456;
        arr[3]=345;
        System.out.println(Arrays.toString(arr));
    }
}