package loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdeNumeros;
        int numero;
        int impar = 0;
        int par = 0;
        int count = 0;

        System.out.println("Informe a quantidade de números que serão digitados: ");
        qtdeNumeros = scan.nextInt();

        do {
            System.out.println("Informe um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) par++;
            else impar++;

            /*
            esse if poderia ter sido feito assim:
            if (numero % 2 == 0) {
            par = par + 1;
            } else {
            impar = impar + 1;
            }
             */

            count++;

        }while (count < qtdeNumeros);

        System.out.println("Total de números ímpares: " + impar);
        System.out.println("Total de números pares: " + par);

    }
}
