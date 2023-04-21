import java.util.Scanner;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa
 */
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = {-6, -5, 15, 50, 8, 4};

        int count = 0;

        while (count < (vetor.length)){
            System.out.println(vetor[count]);
            count++;
        }

        System.out.println("Ordem inversa: ");

        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.println(vetor[i]);
        }
    }
}
