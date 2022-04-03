package sk.juro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player playerOne = new Player();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj Meno");
        playerOne.name = scanner.next();
        System.out.println("Zadaj Priezvisko");
        playerOne.surname = scanner.next();
        System.out.println("Zadaj vek");
        playerOne.age = scanner.nextInt();
        System.out.println("Zadaj Mesto");
        playerOne.country = scanner.next();
        System.out.println(playerOne.toString());

    }
}
