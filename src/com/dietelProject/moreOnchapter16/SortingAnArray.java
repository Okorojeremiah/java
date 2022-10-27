package chapter16;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingAnArray {
    public static void main(String[] args) {
//        String[] array = {"Egg", "Rice", "Bread", "Yam"};
//
//        List<String> list = Arrays.asList(array);
//
//        Collections.sort(list);
//        System.out.print(list);
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.print(list);

        int[] array1 = {2, 7, 4, 5, 9, 10};
        System.out.println(Arrays.toString(arraySort(array1)));

    }

    public static int[] arraySort(int[] array){
        int temp = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = i +1; j < array.length; j++){
                if (array[j] > array[i]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
