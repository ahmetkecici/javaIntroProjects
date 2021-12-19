package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  int mat,fizik,turkce,kimya,muzik,toplam=0;
     double ortalama;
     int dersSayisi=5;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Matematik notunu giriniz");
        mat=scanner.nextInt();
        dersSayisi=(mat>100||0>mat)?dersSayisi-1:dersSayisi;
        toplam=(mat>100||0>mat)?toplam:toplam+mat;

        System.out.println(dersSayisi +" :"+toplam );

        System.out.println("Fizik notunu giriniz");
        fizik=scanner.nextInt();
        dersSayisi=(fizik>100||0>fizik)?dersSayisi-1:dersSayisi;
        toplam=(fizik>100||0>fizik)?toplam:toplam+fizik;
        System.out.println(dersSayisi +" :"+toplam );

        System.out.println("Turkce notunu giriniz");
        turkce=scanner.nextInt();
        dersSayisi=(turkce>100||0>turkce)?dersSayisi-1:dersSayisi;
        toplam=(turkce>100||0>turkce)?toplam:toplam+turkce;

        System.out.println(dersSayisi +" :"+toplam );

        System.out.println("Kimya notunu giriniz");
        kimya=scanner.nextInt();
        dersSayisi=(kimya>100||0>kimya)?dersSayisi-1:dersSayisi;
        toplam=(kimya>100||0>kimya)?toplam:toplam+kimya;

        System.out.println(dersSayisi +" :"+toplam );

        System.out.println("Müzik notunu giriniz");
        muzik=scanner.nextInt();
        dersSayisi=(muzik>100||0>muzik)?dersSayisi-1:dersSayisi;
        toplam=(muzik>100||0>muzik)?toplam:toplam+muzik;
          ortalama=toplam/dersSayisi;
       System.out.println(dersSayisi +" :"+toplam );
        System.out.println("Ortalama: "+ortalama );

        if (ortalama>55) System.out.println("Geçti");
        else System.out.println("Kaldı");





    }
}
