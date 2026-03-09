public class Es3 {
    static void main(String[] args) {

        System.out.println("1) Il perimetro del rettangolo é " + perimetroRettangolo(5.5, 6));

        System.out.println("2) Il numero è pari? ---> " + pariDispari(12));

        System.out.println("3) L'area del triangolo è uguale a: " + areaTriangolo(5,8,10));

    }

    static double perimetroRettangolo (double base, double altezza){
        double perimetro = 2 * (base + altezza);
        return perimetro;

    }

    static boolean pariDispari (int number){
        return number % 2 == 0;
    }

    static double areaTriangolo(double lato1, double lato2, double lato3 ) {
        double semiPerimetro = (lato1 + lato2 + lato3) / 2;

        return Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));
    }
}
