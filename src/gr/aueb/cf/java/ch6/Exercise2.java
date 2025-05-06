package gr.aueb.cf.java.ch6;
import java.util.Arrays;

public class Exercise2 {

    public static void main(String[] args) {

        System.out.println(linearSearch(new int[]{1,2,3,4,5,1},1));
        getEven(new int[]{2,4,5,6,9,0,10,11});
        System.out.println();
        System.out.println(Arrays.toString(getDouble(new int[]{1,2,0,9,10})));
        System.out.println(isPositive(new int[]{-1,-2,-3,0}));
        System.out.println(isAllPositive(new int[]{1,2,3,}));

    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void getEven(int[] arr){

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static int[] getDouble(int[] arr){

        int[] doubleArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            doubleArr[i] = arr[i] * 2;
        }

        return doubleArr;
    }

    public static boolean isPositive(int[] arr){

        for (int i = 0 ; i < arr.length; i++){
            if ( arr[i] > 0){
                return true;
            }
        }
        return false;
    }

    public static boolean isAllPositive(int[] arr){

        for (int i = 0 ; i < arr.length; i++){
            if ( arr[i] <= 0){
                return false;
            }
        }
        return true;
    }
}
