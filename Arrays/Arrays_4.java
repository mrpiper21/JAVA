// Java array members

// Single-dimensional Array: -> When you clone a single-dimensional array, such as Object[], a “deep copy” is performed with the new array containing 
// copies of the original array’s elements as opposed to references.

// Multi-dimensional Arrays -> A clone of a multi-dimensional array (like Object[][]) is a “shallow copy,” however, which is to say that it creates 
// only a single new array with each element array a reference to an original element array, but subarrays are shared.
public class Arrays_4 {
    public static void main(String args[]){
        int intArray[] = {3, 3, 0, 7, 5};
        // Cloning of Single-Dimensional Array
        int cloneArray[] = intArray.clone();
        
        for(int i = 0; i < cloneArray.length; i++){
            System.out.println(cloneArray[i] + " ");
        };
        System.out.println(cloneArray == intArray);

        // Cloning of Multi-Dimensional Array
        int intArray_2[][] = {{3, 2, 2}, {9, 4, 3}};
        int cloneArray_2[][] = intArray_2.clone();

        System.out.println(intArray_2[0] == cloneArray_2[0]);
        System.out.println(intArray_2[1] == cloneArray_2[1]);


    };
};
