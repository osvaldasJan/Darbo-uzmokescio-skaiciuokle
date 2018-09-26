import java.util.Scanner;

/*Reikalavimai:
                * Vartotojas įveda bazinį darbuotojo atlyginimą ir pagamintų detalių kiekį;
                norma- 2000 vnt.
                * Sukurti funkciją, skaičiuojančią darbuotojo atlyginimą
                (DarboUzmokestis * koeficientas);
                * Per parametrus funkcijai perduoti bazinį darbuotojo atlyginimą ir pagamintų detalių kiekį;
                * JEIGU Nepadarė normos (<2000): 0.5 kof
                Pasiekė normą (2000 - 2500): 1 kof
                Viršijo normą (>2500): 1.5 kof
                * PVZ.:
                DarboUzmokestis = 1000;
                detaliuKiekis = 1500;
                Darbuotojo mėnesinis DarboUzmokestis - 500 Eur.
*/

public class Main {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int bazinisDarboUzmokestis;
        int pagamintosDetales;

        System.out.println("Darbo užmokesčio skaičiavimas");
        /*System.out.println("Įveskite darbuotojo bazinį atlyginimą: ");
        bazinisDarboUzmokestis = keyboard.nextInt();
        System.out.println("Įveskite darbuotojo pagamintų detalių skaičių: ");
        pagamintosDetales = keyboard.nextInt();
        */
        /*System.out.println("Galutinis atlyginimas: " +
                apskaiciuotiAtlyginima());
        */
        /*System.out.println("Galutinis atlyginimas, kai bazinis darbo užmokestis " + bazinisDarboUzmokestis +
                " ir pagamintos " + pagamintosDetales + " detalės: " +
                apskaiciuotiAtlyginima(bazinisDarboUzmokestis,
                apskaiciuotiKoeficienta(pagamintosDetales)));
                */
        apskaiciuotiAtlyginima2();
    }
    public static double apskaiciuotiKoeficienta(int detaliuKiekis){
        if (detaliuKiekis < 2000) {
            return 0.5;
        } else if (detaliuKiekis > 2500) {
            return 1.5;
        } else
            return 1;
    }
    public static double apskaiciuotiAtlyginima(int bazinisDarboUzmokestis, double koeficientas){ //metodas su parametrais
        return koeficientas*bazinisDarboUzmokestis;
    }
    public static double apskaiciuotiAtlyginima(){ //metodas be parametru
        System.out.println("Įveskite darbuotojo bazinį atlyginimą: ");
        int bazinisDarboUzmokestis = keyboard.nextInt();
        System.out.println("Įveskite darbuotojo pagamintų detalių skaičių: ");
        int pagamintosDetales = keyboard.nextInt();

        return bazinisDarboUzmokestis*apskaiciuotiKoeficienta(pagamintosDetales);
            }

    public static void apskaiciuotiAtlyginima2(){
        System.out.println("Įveskite darbuotojo bazinį atlyginimą: ");
        int bazinisDarboUzmokestis = keyboard.nextInt();
        System.out.println("Įveskite darbuotojo pagamintų detalių skaičių: ");
        int pagamintosDetales = keyboard.nextInt();

        System.out.println("Galutinis atlyginimas, kai bazinis darbo užmokestis " + bazinisDarboUzmokestis +
                " ir pagamintos " + pagamintosDetales + " detalės: " +
                apskaiciuotiAtlyginima(bazinisDarboUzmokestis,
                        apskaiciuotiKoeficienta(pagamintosDetales)));
    }

    public static void bark() {
        System.out.println("bark");
    }
}
