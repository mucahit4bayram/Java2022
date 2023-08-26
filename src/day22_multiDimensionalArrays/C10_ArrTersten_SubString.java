package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C10_ArrTersten_SubString {
    public static void main(String[] args) {

        String str="12345";
        String harf=str.substring(0,1);
        System.out.println(harf); // 1

        String arr[]= new  String[str.length()];

        for (int i = 0; i <str.length() ; i++) {
            arr[i]=str.substring(i,i+1);

        }
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]

        String tersString="";
        for (int i = arr.length-1; i >=0 ; i--) {
            tersString+=arr[i];
        }
        System.out.println(tersString); // 54321

    }
}
