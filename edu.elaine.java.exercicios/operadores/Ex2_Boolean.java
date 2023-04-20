package operadores;

public class Ex2_Boolean {

    public static void main(String[] args){

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1&&b2 : " + (b1 && b2));
        System.out.println("b1&&b3 : " + (b1 && b3));

        System.out.println("b2||b3 : " + (b2 || b3));
        System.out.println("b2||b4 : " + (b2 || b4));

        System.out.println("b1^b3 : " + (b1 ^ b3));
        //retorna true se os dois operandos têm valores diferentes e false se os dois operandos têm valores iguais.
        System.out.println("b4^b1 : " + (b4 ^ b1));

        System.out.println("!b1 : " + (!b1));
        //inverte o valor booleano da variáve. Ex. se b1 for true, ele vai retornar false.
        System.out.println("!b2 : " + (!b2));

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("(i1 > i2) || (f2 < f1) : " + ((i1 > i2) || (f2 < f1)));
        System.out.println("((i1 + i2) < (f2 - f1)) && true : " + (((i1 + i2) < (f2 - f1)) && true));
        /* essa expressão verifica se a primeira parte da expressão é verdadeira ou falsa,
        depois ela compara com o &&true, se a primeira parte for verdadeira, então o resultado é true
        se a primeira parte fosse falsa, então o resultado seria false.
         */

        //criar valores intermediários para diminuir uma expressão, exemplo:

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println("Usando Expressão longa: " + ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)));

        //Usando as boas práticas
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println(salarioBaixo && muitosDependentes);

        boolean recebeAuxilio = salarioBaixo && muitosDependentes;
        System.out.println("recebe auxílio: " + recebeAuxilio);

    }
}
