package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	 int ilkSayi,ikinciSayi,islem;

        Scanner scanner =new Scanner(System.in);
        System.out.println("İlk sayıyı Giriniz");
        ilkSayi=scanner.nextInt();
        System.out.println("İkinci sayıyı Giriniz");
        ikinciSayi=scanner.nextInt();
        System.out.println("İşlemi giriniz   1/Toplama 2/Çıkarma 3/Çarpma 4/Bölme");
        islem=scanner.nextInt();


        switch (islem){
            case 1:
                System.out.println("Toplam sonucu:\n"+(ilkSayi+ikinciSayi));
                break;
            case 2:
                System.out.println("Çıkarma sonucu:\n"+(ilkSayi-ikinciSayi));
                break;
            case 3:
                System.out.println("Çarpma sonucu:\n"+(ilkSayi*ikinciSayi));
                break;
            case 4:
                System.out.println("Bölme sonucu:\n"+(ilkSayi/ikinciSayi));
                break;
            default:
                System.out.println("Böyle bir işlem bulunmamakta programı tekrar çalıştırın");

        }


    }
}
