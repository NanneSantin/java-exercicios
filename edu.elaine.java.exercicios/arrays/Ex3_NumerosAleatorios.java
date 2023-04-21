import java.util.Scanner;
/*
Faça um programa que leia 20 números inteiros aleatórios
(entre 0 e 100) e os armazene em um vetor.
Ao final mostre os números e os seus sucessores.
 */
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] aleatorio = new int[20];

        int count = 0;

        do{
            System.out.println("Informe um número: ");
            int numero = scan.nextInt();
            aleatorio[count] = numero;

            count++;

        }while (count < aleatorio.length);

        System.out.print("Numeros aleatórios: ");

        for (int numero : aleatorio
             ) {
            System.out.print(numero + " ");
        }

        System.out.println("\n");
        System.out.print("Sucessores dos números aletatórios: ");

        for (int numero : aleatorio
        ) {
            System.out.print((numero + 1) + " ");
        }
    }
}
