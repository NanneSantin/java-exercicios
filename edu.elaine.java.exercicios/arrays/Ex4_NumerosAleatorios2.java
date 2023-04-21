import java.util.Random;
/*
Faça um programa que leia 20 números inteiros aleatórios
(entre 0 e 100) e os armazene em um vetor.
Ao final mostre os números e os seus sucessores.
---Essa é a versão da aula.
 */
public class Ex4_NumerosAleatorios2 {
    public static void main(String[] args) {
        Random aleatorio = new Random(); //classe para gerar números aleatórios

        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++){
            int numero = aleatorio.nextInt(100); //pegando um número aleatório entre 0 e 100
            numeros[i] = numero; //atribuindo o valor pego ao elemento na respectiva posição do array numeros
        }

        System.out.print("Numeros aleatórios: ");
        for (int numero : numeros
        ) {
            System.out.print(numero + " ");
        }

        System.out.println("\n--------------------");
        System.out.print("Sucessores dos números aletatórios: ");

        for (int numero : numeros
        ) {
            System.out.print((numero + 1) + " ");
        }
    }
}
