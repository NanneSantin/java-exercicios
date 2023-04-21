package loops;

import java.util.Scanner;
/*
Desenvolva um gerador de tabuada capaz de
gerar a tabuada de qualquer número inteiro.
A tabuada deve mostrar a multiplicação desse número inteiro
do 1 até o 10.
O usuário deve informar qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada do 5:
1 x 5 = 5
2 x 5 = 10
...
10 x 5 = 50
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número inteiro para ver a tabuada: ");
        numero = scan.nextInt();

        System.out.println("Tabuada do " + numero);
        for (int i = 1; i <= 10; i++){
            System.out.println(" " + i + " x " + numero + " = " + (i * numero));
        }
    }
}
