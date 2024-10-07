/*
* File: App.java
* Author: Ambrus Zsolt
* Copyright: 2024, Ambrus Zsolt
* Group: Szoft II/I/N
* Date: 2024-10-06
* Github: https://github.com//
* Licenc: GNU GPL
*/
import java.util.Scanner;
public class Rombatl{
    /**
     /* A Rombusz területét
     /*  kiszámoló függvény.
     /*  Beolvassa a rombusz két átlóját,
     /*  majd kiszámolja a területét.
     */
    public void RombTerulet(){

        System.out.println("Rombusz területét kiszámoló program.");
        Scanner scanner = new Scanner(System.in);
        System.out.println(); System.out.println("Első átló: ");
        String elsoBe = scanner.nextLine();
        Double elsoatlo = Double.valueOf(elsoBe);
        System.out.println("Második átló: ");                               
        String masodikBe = scanner.nextLine();
        Double Masodikatlo = Double.valueOf(masodikBe); 
        Double ossz = (1.0/2.0) * elsoatlo * Masodikatlo;
        System.out.println("Rombusz területe: " + ossz);
        scanner.close();

    }
}