package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo,total;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Armutun kilosunu giriniz");
        armutKilo=scanner.nextDouble();
        System.out.println("Elmanın kilosunu giriniz");
        elmaKilo=scanner.nextDouble();
        System.out.println("Domatesin kilosunu giriniz");
        domatesKilo=scanner.nextDouble();
        System.out.println("Muzun kilosunu giriniz");
        muzKilo=scanner.nextDouble();
        System.out.println("Patlıcanın kilosunu giriniz");
        patlicanKilo=scanner.nextDouble();
        total=(armutKilo*2.14)+(elmaKilo*3.67)+(domatesKilo*1.11)+(muzKilo*0.95)+(patlicanKilo*5.0);
        System.out.println("Toplam fiyat:"+total);
    }
}
