package loops;

import java.util.Scanner;

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
