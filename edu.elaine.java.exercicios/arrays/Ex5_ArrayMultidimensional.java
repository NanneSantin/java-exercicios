import java.util.Random;
/*
Gere e imprima uma matriz 4x4 com valores aleatórios
entre 1 e 9.
 */
public class Ex5_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random(); //classe para gerar números aleatórios

        int[][] m = new int[4][4]; //forma de declara a matriz

        for (int i = 0; i < m.length; i++){ //percorre a matriz
            for (int j = 0; j < m[i].length; j++){ //percorre a linha da matriz
                m[i][j] = random.nextInt(9); //atribui um número aleatório a posição do elemento
            }
        }

        System.out.println("Matriz: ");

        for (int[] linha : m) { //para cada linha da matriz
            for (int elementoDaColuna : linha) { //pegue a coluna desta linha
                System.out.print(elementoDaColuna + " "); //imprima esta coluna
            }
            System.out.println();
        }
    }
}
