// Returning Arrays from Methods
public class Arrays3 {
    public static void main(String args[]){
        int arr[] = m1();
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
            
    };

    public static int[] m1(){
        return new int[]{2, 4, 5,2 };
    };
};
