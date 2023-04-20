package loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = -99999;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("Informe um número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior){
                maior = numero;
            }

            count = count + 1;
        } while (count < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + (soma/5));

    }
}
