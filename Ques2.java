import java.util.Arrays;

public class Ques2 {
    public static final int MAX = 21; //as numbers will be between 0 and 20
    public static int[] countSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[MAX];

        for(int i=0;i<n;i++)
            count[arr[i]]++; //Store the count of each element

        for(int i=1;i<MAX;i++)
            count[i] += count[i - 1]; //Store the cummulative count of each array

        for (int i = n - 1; i >= 0; i--){
            output[count[arr[i]] - 1] = arr[i]; //Find the index of each element of the original array in count array and place the elements in output array
            count[arr[i]]--; // Decreasing the count of that element
        }

        return output;
    }

    public static void main(String[] args){
        int[] data = { 4, 2, 2, 8, 3, 3, 1, 20, 0, 15, 7, 6};
        int[] arr = countSort(data);
        System.out.println(Arrays.toString(arr));
    }
}
