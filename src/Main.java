import java.util.Scanner;

public class Main{
    public static void main() {

        System.out.println("Välkommen till vårt café!");

        Scanner scanner = new Scanner(System.in);

        final double KAFFE_PRIS = 25;
        final double BULLE_PRIS = 30;
        final double SMORGAS_PRIS = 55;
        final double JUICE_PRIS = 20;

        System.out.println("Vad heter du?");
        String namn = scanner.nextLine();

        System.out.println("Hur många kaffe vill du ha? (25 kr)");
        int antalKaffe = scanner.nextInt();

        System.out.println("Hur många kanelbullar vill du ha? (30 kr)");
        int antalBulle = scanner.nextInt();

        System.out.println("Hur många smörgåsar vill du ha? (55 kr)");
        int antalSmorgas = scanner.nextInt();

        System.out.println("Hur många juice vill du ha? (20 kr)");
        int antalJuice = scanner.nextInt();

        double kaffePris = antalKaffe * KAFFE_PRIS;
        double bullePris = antalBulle * BULLE_PRIS;
        double smorgasPris = antalSmorgas * SMORGAS_PRIS;
        double juicePris = antalJuice * JUICE_PRIS;

        double totalPris = kaffePris + bullePris
                + smorgasPris + juicePris;

        System.out.println("Har du rabattkod? (1 för JA, 0 för NEJ)");
        int harRabattkod = scanner.nextInt();

        double rabatt = 0;

        if (harRabattkod == 1) {
            System.out.println("Hur mycket rabatt? (i procent)");
            int procentRabatt = scanner.nextInt();

            rabatt = totalPris * procentRabatt / 100.0;
            totalPris = totalPris - rabatt;

            System.out.println("Du fick " + procentRabatt + "% rabatt!");
        }

        if (harRabattkod == 0) {
            System.out.println("Du har ingen rabattkod.");
        }

        System.out.println("Vill du ge dricks? Hur mycket i kr? (0 om ingen)");
        double dricks = scanner.nextDouble();

        System.out.println("Hur många personer ska dela notan?");
        int antalPersoner = scanner.nextInt();

        System.out.println("Vill du ha kvitto? (1 för JA, 0 för NEJ)");
        int villHaKvitto = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Vill du betala med kort eller kontant?");
        String betalning = scanner.nextLine();

        double moms = totalPris * 0.12 / 1.12;
        double slutPris = totalPris + dricks;
        double prisPerPerson = slutPris / antalPersoner;

        if (villHaKvitto == 1) {
            System.out.println("======== KVITTO ========");
            System.out.println("Kund: " + namn);
            System.out.println("------------------------");
            System.out.println("Kaffe: " + antalKaffe + " st = " + kaffePris + " kr");
            System.out.println("Kanelbulle: " + antalBulle + " st = " + bullePris + " kr");
            System.out.println("Smörgås: " + antalSmorgas + " st = " + smorgasPris + " kr");
            System.out.println("Juice: " + antalJuice + " st = " + juicePris + " kr");
            System.out.println("------------------------");
            System.out.println("Rabatt: " + rabatt + " kr");
            System.out.println("Moms: " + moms + " kr");
            System.out.println("Dricks: " + dricks + " kr");
            System.out.println("Slutpris: " + slutPris + " kr");
            System.out.println("Antal personer: " + antalPersoner);
            System.out.println("Pris per person: " + prisPerPerson + " kr");
            System.out.println("Betalningssätt: " + betalning);
            System.out.println("========================");
            System.out.println("Tack för besöket, " + namn + "!");
        }

        if (villHaKvitto == 0) {
            System.out.println("Du valde att inte få kvitto.");
            System.out.println("Slutpris: " + slutPris + " kr");
            System.out.println("Pris per person: " + prisPerPerson + " kr");
            System.out.println("Betalningssätt: " + betalning);
            System.out.println("Tack för besöket, " + namn + "!");
        }
            }
        }
