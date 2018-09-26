import java.util.Scanner;

/*Reikalavimai:
                * Vartotojas įveda bazinį darbuotojo atlyginimą ir pagamintų detalių kiekį;
                norma- 2000 vnt.
                * Sukurti funkciją, skaičiuojančią darbuotojo atlyginimą
                (atlyginimas * koeficientas);
                * Per parametrus funkcijai perduoti bazinį darbuotojo atlyginimą ir pagamintų detalių kiekį;
                * JEIGU Nepadarė normos (<2000): 0.5 kof
                Pasiekė normą (2000 - 2500): 1 kof
                Viršijo normą (>2500): 1.5 kof
                * PVZ.:
                atlyginimas = 1000;
                detaliuKiekis = 1500;
                Darbuotojo mėnesinis atlyginimas - 500 Eur.
*/

public class Main {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Įveskite vartotojo bazinį atlyginimą: ");
        int bazinisAtlyginimas = keyboard.nextInt();
        System.out.println("Įveskite pagamintų detalių skaičių: ");
        int pagamintosDetales = keyboard.nextInt();

        System.out.println("Galutinis atlyginimas, kai pagamintos " +
                pagamintosDetales + " detalės: " +
                atlyginimoSkaiciavimas (bazinisAtlyginimas,
                koeficientoSkaiciavimas(pagamintosDetales)));
    }
    public static double koeficientoSkaiciavimas (int detaliuKiekis){
        if (detaliuKiekis < 2000) {
            return 0.5;
        } else if (detaliuKiekis > 2500) {
            return 1.5;
        } else
            return 1;
    }
    public static double atlyginimoSkaiciavimas (int bazinisAtlyginimas, double koeficientas){
        return koeficientas*bazinisAtlyginimas;
    }
    public static void bark() {
        System.out.println("bark");
    }
}
