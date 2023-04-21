package loops;

import java.util.Scanner;
/*
Faça um programa que peça uma nota entre 0 e 10.
Mostre uma mensagem caso o valor seja inválido e continue
pedindo até o usuário informar um valor válido.
 */
public class Ex2_Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota;

        System.out.println("Informe uma nota entre 0 e 10: ");
        nota = scan.nextDouble();

        while (nota <0 || nota >10){
            System.out.println("Valor inválido!");
            System.out.println("Informe uma nota entre 0 e 10: ");
            nota = scan.nextDouble();
        }

        System.out.println("Nota registrada com sucesso!");
    }
}
