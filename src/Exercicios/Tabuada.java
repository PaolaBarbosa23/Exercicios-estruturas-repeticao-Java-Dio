package Exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int i = 0; i <= 10; i = i + 1){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
