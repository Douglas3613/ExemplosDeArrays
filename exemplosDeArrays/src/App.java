import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int field = 0;
        // exemplos de uma das formas de se construir arrys 
        int[] arr1 = new int[6];
        arr1[0] = 21;
        arr1[2] = 99;
        arr1[5] = -80;
        arr1[1] = 45;
        arr1[3] = 12;
        arr1[4] = 14;
        int[] arr2 = {21,45,99,12,14,-80} ;

        int arr3[] = new int[1] ;
        int arr4[] = {};
        int arr5[] = {};


        System.out.println("##############################");

        arr1[4] = 84;
 
        for (int i = 0; i < 6; i++){
         System.out.println("arr1 [" + i + "]" + arr1[i]  + " arr2 = [" + i + "]" + arr2[i]);


        }
        System.out.println("###########################");
        //exemplo2
        int arr[] = {15,9,0,21,13,17,5};

        for (int i : arr){
        //System.out.println(i + " ");

        int busca = 17;
        Arrays.sort(arr); // para ordenar os objetos dentro da arry
        System.out.println("Search -> " + Arrays.binarySearch(arr, busca)); // para achar o binario
        System.out.println();
        System.out.println("valor " + i);
        } 
       /* int busca = 21;
        for (int i : arr){
            System.out.println("Search -> " + Arrays.binarySearch(arr, busca));

        
       }*/
    }
}
