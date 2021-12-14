package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double boy,endeks;

    int kilo;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Boyunuzu giriniz/(metre cinsinden)");
        boy=scanner.nextDouble();
        System.out.println("Kilonuzu giriniz");
        kilo=scanner.nextInt();
        endeks=kilo/(boy*boy);
        System.out.println(endeks);
    }
}
