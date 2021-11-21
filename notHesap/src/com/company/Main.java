package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
     int mat,fizik,kimya,turkce,tarih,muzik;
     Scanner input =new Scanner(System.in);
        System.out.println("Matematik notunu giriniz");

        mat =input.nextInt();
        System.out.println("Fizik notunu giriniz");

        fizik =input.nextInt();
        System.out.println("Kimya notunu giriniz");

        kimya =input.nextInt();
        System.out.println("Turkce notunu giriniz");

        turkce =input.nextInt();
        System.out.println("Tarih notunu giriniz");

        tarih =input.nextInt();
        System.out.println("Müzik notunu giriniz");

        muzik =input.nextInt();

        int toplam=mat+fizik+kimya+tarih+turkce+muzik;
        double sonuc=toplam/6.0;
       String message= sonuc>60 ? "Tebrikler geçtiniz ortalamanı:" +sonuc :"Malesef kaldınız" +sonuc;
        System.out.println(message);
    }
}
