public class Arrays1 {
    public static void main(String[] args){
        int arr[][] = new int[4][3];

        // number of rows
        System.out.println("rows: " +arr.length);

        // number of columns
        System.out.println("col: " + arr[0].length);

        // 2D matrix
        int arr2[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[0].length; j++)
                System.out.println(arr2[i][j] + " ");
                
            System.out.println();
        }
    };
};
