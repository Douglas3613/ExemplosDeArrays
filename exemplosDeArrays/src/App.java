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
    }
}
