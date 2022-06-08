package Hesaplamalar;

import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {
        int month,day;
        boolean error= false;

        Scanner input=new Scanner(System.in);
        System.out.print("Dogdugunuz Ayi Giriniz (Sayi Olarak) : ");
        month=input.nextInt();

        System.out.print("Dogdugunuz Gunu Giriniz : ");
        day=input.nextInt();

        if (month == 1){
            if (day<22){
                System.out.println("Burcunuz Oglaktir");
            }else if (day<=31){
                System.out.println("Burcunuz Kovadir");
            }else error=true;
        }
        if (month == 2){
            if (day<20){
                System.out.println("Burcunuz Kovadir");
            }else if (day<=29){
                System.out.println("Burcunuz Baliktir");
            }else error= true;
        }
        if (month == 3){
            if (day<21){
                System.out.println("Burcunuz Baliktir");
            }else if(day<=31) {
                System.out.println("Burcunuz Koctur");
            }else error=true;
        }
        if (month == 4){
            if (day<20){
                System.out.println("Burcunuz Koctur");
            }else if (day<=30){
                System.out.println("Burcunuz Bogadir");
            }else error=true;
        }
        if (month == 5){
            if (day<22){
                System.out.println("Burcunuz Bogadir");
            }else if (day<=31) {
                System.out.println("Burcunuz Ikizlerdir");
            }else error=true;
        }
        if (month == 6){
            if (day<23){
                System.out.println("Burcunuz Ikizlerdir");
            }else if (day<=30){
                System.out.println("Burcunuz Yengectir");
            }else error=true;
        }
        if (month == 7){
            if (day<23){
                System.out.println("Burcunuz Yengectir");
            }else if (day<=31){
                System.out.println("Burcunuz Aslandir");
            }else error=true;
        }
        if (month == 8){
            if (day<23){
                System.out.println("Burcunuz Basaktir");
            }else if (day<=31){
                System.out.println("Burcunuz Aslandir");
            }else error=true;
        }
        if (month == 9){
            if (day<23){
                System.out.println("Burcunuz Basaktir");
            }else if (day<=30){
                System.out.println("Burcunuz Terazidir");
            }else error=true;
        }
        if (month == 10){
            if (day<23){
                System.out.println("Burcunuz Terazidir");
            }else if (day<=31){
                System.out.println("Burcunuz Akreptir");
            }else error=true;
        }
        if (month == 11){
            if (day<22){
                System.out.println("Burcunuz Akreptir");
            }else if (day<=30){
                System.out.println("Burcunuz Yaydir");
            }else error=true;
        }
        if (month == 12){
            if (day<22) {
                System.out.println("Burcunuz Yaydir");
            } else if (day<=31){
                    System.out.println("Burcunuz Oglaktir");
                }else error=true;
            }
        if ((month>12) || (month<1)){
            System.out.println("Hatali Ay Girisi!");
        }else if (error){
            System.out.println("Hatali Gun Girisi!");
        }
        }
        }
