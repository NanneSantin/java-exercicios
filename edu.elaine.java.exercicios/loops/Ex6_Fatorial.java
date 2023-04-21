package loops;

import java.util.Scanner;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido
pelo usuário.
Ex.: 5! = 120 ---> 5 x 4 x 3 x 2 x 1
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scan.nextInt();

        int fatorial = 1;

        for (int i = numero; i >= 1; i--){
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
        System.out.println(numero + "!= " + fatorial);

    }
}
