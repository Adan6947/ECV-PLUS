import java.util.Scanner;

public class Code_EVC_PLUS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pinCODE = "*770#";
        int haraaga = 1000;
        String xaqijin = "haa";
        String pincode_Entering = input.next();


        if (pinCODE.equals(pincode_Entering)) {
            System.out.println("-EVCPLUS-");
            System.out.println("Fadlan geli PIn-kaaga (Enter pin)");
            int pin = input.nextInt();

            System.out.println("1. Itus Haraaga");
            System.out.println("2. Kaarka hadalka");
            System.out.println("3. Bixi Biil");
            System.out.println("4. U wareeji EVCPLUS");
            System.out.println("5. Warbixin kooban");
            System.out.println("6. Salaam Bank");
            System.out.println("7. Maareynta");
            System.out.println("8. Bill Payment");
            int choosingPhase2 = input.nextInt();
            switch (choosingPhase2) {
                case 1:
                    System.out.println("Haraagaaga waa $" + haraaga);
                    break;

                case 2:
                    System.out.println("-Kaarka hadalka-");
                    System.out.println("1. Ku shubo Airtime");
                    System.out.println("2. Ugu shub Airtime");
                    System.out.println("3. Ku shub Internet");
                    System.out.println("4. Kanoqo");
                    int kaarkaHadalka = input.nextInt();
                    if (kaarkaHadalka == 1) {
                        System.out.println("Fadlan gali qadarka aad rabto inaad ku shubto:");
                        int qadarka = input.nextInt();
                        if (haraaga >= qadarka)
                            System.out.println("ma hubtaa ina " + qadarka + "aa ku shubatid\n 1.haa \n 2.maya");
                        else
                            System.out.println("haragaaga kugu ma filna");
                        int hubin = input.nextInt();

                        if (hubin == 1)
                            System.out.println("Waxad si guul ah ugu shubtay qadar lacag $" + qadarka);
                        else if (hubin == 2)
                            System.out.println("Howlgalkii waa la jojiyay");

                    } else if (kaarkaHadalka == 2) {
                        System.out.println("Fadlan gali numberka aad ugu shubayso:");
                        int number = input.nextInt();
                        System.out.println("Fadlan gali qadarka:");
                        int qadarka = input.nextInt();
                        if (qadarka <= haraaga)
                            System.out.println("Waad ugu shubtay $" + qadarka + " numberka " + number +
                                    " Mahadsanid");
                        else
                            System.out.println("haragag kuguma filna");
                    } else if (kaarkaHadalka == 3) {
                        System.out.println("Fadlan dooro xirmada internet:");
                        System.out.println("1. 1GB - $1");
                        System.out.println("2. 20GB - $30");
                        System.out.println("3. 90GB - $50");
                        int xirmo = input.nextInt();
                        if (xirmo == 1) {
                            System.out.println("Waad iibsatay 1GB");
                        } else if (xirmo == 2) {
                            System.out.println("Waad iibsatay 5GB");
                        } else if (xirmo == 3) {
                            System.out.println("Waxaa iibsatay 90GB");
                        } else {
                            System.out.println("Xulasho aan sax ahayn");
                        }
                    } else if (kaarkaHadalka == 4) {
                        System.out.println("Waad kusoo laabatay menu-ga hore");
                    } else {
                        System.out.println("Xulasho khaldan");
                    }
                    break;

                case 3:
                    System.out.println("-Bixi Biil-");
                    System.out.println("1.Post paid");
                    System.out.println("1.Ku iibso");
                    input.nextLine(); // clear buffer
                    String shirkada = input.nextLine();
                    System.out.println("Fadlan gali lacagta aad rabto inaad bixiso:");
                    int lacag = input.nextInt();
                    System.out.println("Waxaad si guul leh ugu bixisay $" + lacag + "");
                    break;
                case 4:
                    System.out.println("Fadlan gali mobile-ka:");
                    int wareejinlacag = input.nextInt();
                    System.out.println("Fadlan gali lacagta:");
                    int Uwareejinlacag = input.nextInt();
                    int haraagaa = haraaga - Uwareejinlacag;
                    System.out.println("Ma hubtaa inaad u wareejiso lambarkaan " + wareejinlacag + " lacag dhan $" + Uwareejinlacag + "?");
                    System.out.println("1. Haa");
                    System.out.println("2. Maya");
                    int goaanwareejin = input.nextInt();
                    if (goaanwareejin == 1) {
                        System.out.println("$" + Uwareejinlacag + " ayaad u wareejisay lambar-kaan " + wareejinlacag);
                        System.out.println("Haraagaagu waa $" + haraagaa);
                        System.out.println("Mahadsanid");
                    } else if (goaanwareejin == 2) {
                        System.out.println("Waad la noqdaay codsigaaga");
                        System.out.println("Mahadsanid");
                    } else {
                        System.out.println("Waxaad ka baxday xadkaaga");
                        System.out.println("Macasalaamo");
                    }
                    break;
                case 5:
                    System.out.println("-Warbixin kooban-");
                    System.out.println("1.Last Action");
                    System.out.println("2. Wareejintii u danbeysay");
                    System.out.println("3. Iibsashadii u dambeysay");
                    System.out.println("4. Last 3 Action");
                    System.out.println("5.Email me my Activity");
                    break;
                case 6:
                    System.out.println("-Salaam Bank-");
                    System.out.println("1. I tus Haraaga");
                    System.out.println("2. Lacag dhigasho");
                    System.out.println("3. Lacag qaadasho");
                    System.out.println("4. kabax");
                    int bankOption = input.nextInt();
                    if (bankOption == 1) {
                        System.out.println("Koontadaada salaam bank 91246786 haraageedu waa $200,000");
                    } else if (bankOption == 2) {
                        System.out.println("Geli lacagta:");
                        int qadarka = input.nextInt();
                        System.out.println("waxaa koontadaada bankiga lagu daray $" + qadarka + " ");

                    } else if (bankOption == 3) {
                        System.out.println("Geli lacagta inaa qaadato aad rabto");
                        int qadasho = input.nextInt();
                        System.out.println("Waa ku guuleysatay inaaa la baxdo $" + qadasho + " .");
                        System.out.println("Mahadsanid.");
                    } else {
                        System.out.println("Waa ku mahadsantahay isticmaalka adeegena");
                    }
                    break;
                case 7:
                    System.out.println("-Maareynta-");
                    System.out.println("1.Bedel lambarka sirta ah");
                    System.out.println("2.Bedel Luuqada");
                    System.out.println("3.Wargelin mobile lumay");
                    System.out.println("4.Lacag xerasho");
                    System.out.println("5.U celi lacag qaldantay");
                    int options = input.nextInt();
                    if (options == 1){
                        System.out.println("Gali pin-Kaaga cusub");
                    }else if (options == 2){
                        System.out.println("Fadlan dooro luuqada");
                        System.out.println("1.English");
                        System.out.println("1.Soomaali");
                    }else if (options == 3){
                        System.out.println("Fadlan geli lambarka lumay");
                    } else if (options == 4) {
                        System.out.println("Fadlan geli number-ka qaladka ah");
                    } else if (options == 5) {
                        System.out.println("Fadlan geli aqoonsiga lacagta dirida");
                    }
                    break;
                case 8:
                    System.out.println("-Bill Payment-");
                    System.out.println("1.Itus Haraaga Biil ka");
                    System.out.println("2.Wada bixi Bill-ka");
                    System.out.println("3.Qeyb ka bixi Bill-ka");
                    int lambarka = input.nextInt();
                    System.out.println("Fadlan gali qadarka lacagta: ");
                    int lacagDiris = input.nextInt();
                    System.out.println("3.Qeyb ka bixi Bill-ka");
                    System.out.println("Waxaad si guul leh ugu dirtay $" + lacagDiris + " ");
                    break;
                case 9:
                    System.out.println("Fadlan dooro Lamabar sax ah.");
                    break;

                default:
                    System.out.println("Fadlan dooro Lamabar sax ah.");
            }

        } else {
            System.out.println("Shortcode ka aad garaacday ma ahan mid jira.");
        }
    }
}


