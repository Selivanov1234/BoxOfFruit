package GBJava.arr;

import java.util.Arrays;
import java.util.List;

public class ArrShift <T> {

   private T arr[];
   private T temp;

    public ArrShift(T[] arr, T temp) {
        this.arr = arr;
        this.temp = temp;
    }

    public void arrToList (T [] array ) {
        List<T> list = Arrays.asList(array);
        System.out.println(list);
    }

    public void shift(int indexOne, int indexTwo) {
        System.out.println("Array is : " + Arrays.toString(arr));
        if (indexOne > arr.length || indexTwo > arr.length) {
            System.out.println("No such index!");
        }else {
            temp = arr[indexOne];
            arr[indexOne] = arr[indexTwo];
            arr[indexTwo] = temp;
        }
        System.out.println("Changed Array: " + Arrays.toString(arr));
    }
}
