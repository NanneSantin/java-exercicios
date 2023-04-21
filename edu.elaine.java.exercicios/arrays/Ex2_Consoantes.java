import java.util.Scanner;
/*
Faça um programa que leia um vetor de 6 caracteres
e diga quantas consoantes foram lidas.
Imprima as consoantes
 */
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int count = 0;
        int qtdeConsoantes = 0;

        do{
            System.out.println("Informe uma letra: ");
            String letra = scan.nextLine();

            if (!(letra.equalsIgnoreCase("a") ||
                  letra.equalsIgnoreCase("e") ||
                  letra.equalsIgnoreCase("i") ||
                  letra.equalsIgnoreCase("o") ||
                  letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                qtdeConsoantes++;
            }

            count = count + 1;
        }while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if(consoante != null)
                System.out.println(consoante);
        }
        /*
        Para cada elemento (consoante) dentro do meu array (consoantes)
        eu quero que vc imprima esse elemento.
        O if é para não aparecer o null quando tiver uma vogal na posição do vetor.
         */
        System.out.println("Total de consoantes: " + qtdeConsoantes);

    }
}
