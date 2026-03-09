import java.util.Scanner;

public class Es2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //PRIMA STRINGA
        System.out.println("Gentile Utente, inserisca la prima stringa:");
        String firstString = scanner.nextLine();

        System.out.println("La prima stringa è: " + firstString);

        //SECONDA STRINGA
        System.out.println("Ora inserire la seconda stringa: ");
        String secondString = scanner.nextLine();

        System.out.println("La seconda stringa è: " +secondString);

        //TERZA STRINGA

        System.out.println("Ora inserira la terza stringa: ");
        String thirdString = scanner.nextLine();

        System.out.println("La terza stringa è:" + thirdString);

        //Array

        String[] resultsArr = {firstString, secondString,thirdString};

        // stampare in ordine
        String result = "";
        for(int i = 0; i < resultsArr.length;i++) {
            result += resultsArr[i];
        }

        System.out.println("Stampa in ordine: " + result);

        // stampare in ordine inverso
        String reverseResult = "";

        for (int i = resultsArr.length - 1; i >= 0; i--) {
            reverseResult += resultsArr[i];
        }

        System.out.println("Stampa in ordine inverso: " + reverseResult);

    }
}
