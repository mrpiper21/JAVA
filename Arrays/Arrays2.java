package Arrays;
// Passing Arrays to Methods

public class Arrays2 {
    public static void main(String[] args){
        int arr[] = {3, 2, 5, 1, 4};

        sum(arr);
    }

    public static void sum(int arr[]){
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        };
        System.out.println(sum);
    };
};
