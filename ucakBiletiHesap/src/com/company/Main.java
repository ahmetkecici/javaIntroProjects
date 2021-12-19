package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double biletFiyati;
        double mesafeBasiTutar = 0.1;
        double indirimTutar = 0;
        int age;
        int mesafe;
        byte yolculukTipi;
        boolean isError=false;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Mesafeyi km türünden giriniz");

        mesafe = scanner.nextInt();
        System.out.println("Yaşı giriniz");
        age = scanner.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTipi = scanner.nextByte();

        switch (yolculukTipi) {
            case 1:
                if (mesafe > 0) {
                    if (age > 0) {

                        if (age < 12) {

                            indirimTutar += 50;

                        } else if (age < 24 || age > 12) {
                            indirimTutar += 10;
                        } else if (age > 65) {
                            indirimTutar += 30;
                        }

                    } else {
                        isError = true;
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:

                if (mesafe > 0) {
                    if (age > 0) {
                        indirimTutar=+20;
                        if (age < 12) {
                            indirimTutar += 50;
                        } else if (age < 24 || age > 12) {
                            indirimTutar += 10;
                        } else if (age > 65) {
                            indirimTutar += 30;
                        }

                    } else {
                        isError = true;
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
                break;
        }

        if(isError){
            System.out.println("Hatalı veri girişi");
        }else{
            System.out.println(indirimTutar);
            biletFiyati=(mesafeBasiTutar*mesafe);
            biletFiyati=biletFiyati-biletFiyati*(indirimTutar/100);
            System.out.println( biletFiyati);
        }
    }
}
