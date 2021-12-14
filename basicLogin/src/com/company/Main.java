package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 String userName,password;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kullanıcı adı:");
        userName=scanner.nextLine();
        System.out.println("Şifre:");
        password=scanner.nextLine();
        if (userName.equals("patika")&&password.equals("123")){
            System.out.println("Giriş Başarılı");
        }else if(userName.equals("patika")&&(!password.equals("123"))){
            System.out.println("Bilgiler yanlış şifre sıfırlamak istermisiniz 1/evet 2/hayır");
            int secim=scanner.nextInt();
            if (secim==1){
                System.out.println("Şifre:");
                  Scanner scanner1=new Scanner(System.in);
                password=scanner1.nextLine();
                if (password.equals("123")){
                    System.out.println("Şifre oluşturulamadı");
                }else {
                    System.out.println("Şifre değiştirilme başarılı");
                }
            }else {
                System.out.println("Şifre yanlış bideha deneyin");
            }
        }else {
            System.out.println("kullanıcı yok");
        }

    }
}
