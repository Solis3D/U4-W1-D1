import java.util.Arrays;

public class Es1 {
    static void main(String[] args) {

        // Moltiplicazione
        System.out.println("1) Il risultato della moltiplicazione è: " + multiply(3,3));

        // Concatenazione
        System.out.println("2) La concatenazione risultante è: " + concatStrings("Ugo", 23));

        //insertinArray
        String[] testArr = {"Ugo", "Ciro", "Ambrogio", "Amedeo", "Gianluca"};
        System.out.println("3) L'array risultante è: " + Arrays.toString(insertArray(testArr, "Gianpirlo")));


    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    static String concatStrings(String str, int num) {
        return str + num;
    }

    static String[] insertArray(String[] arr, String str) {

        String[] newArr = new String[6];

        for (int i = 0; i < newArr.length; i++) {
            if (i < 2) {
                newArr[i] = arr[i];
            }else if (i == 2){
                newArr[i] = str;
            } else {
                newArr[i] = arr [i-1];
            }
        }
        return newArr;
    }


}
