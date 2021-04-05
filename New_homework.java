package geekbrains.lesson.kremleva;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

      int[] myArray = {1, 0, 0, 1, 0, 0, 1, 0, 1, 0};
      public static int (int[] myArray) {
          for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (myArray[i] == 0) ? 1 : 0; }
         System.out.println(myArray);
     }
     }

     public static void (int[] array) {
         int [] array2 = new int [8];
      for (int i = 0; i < array2.length; i = i + 3) {
        array2[i] = "Value" + i;
    }
    int i;
    for (i = 0; i < array2.length; i = i + 3) {
      System.out.println(array2[i] + " | "); }
}
    int[] array = [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ];
    public static void (int[] array) {

      for (int i = 0; i < array.length; i++) {
        if (array[i] < 6) {
          array[i] *= 2;
}
        }
        System.out.println(array[i]);
    }

    public static int arrayMin(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if (min > array[i])
                min = array[i];
        }
        return min;
    }
    public static int arrayMax(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if (max < array[i])
                max = array[i];
        }
        return max;
    }
    }

