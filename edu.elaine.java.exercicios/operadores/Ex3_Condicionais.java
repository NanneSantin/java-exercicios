package operadores;

public class Ex3_Condicionais {

    public static void main(String[] args) {

        atividadeIf();
        atividadeSwitchUm();
        atividadeSwitchDois();
    }

    private static void atividadeIf(){

        int mes = 12;

        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês inválido.");
        }

        //Aqui o ideal era usar o switch, mas o exercício pedia o uso do if.
        if ((mes == 1) || (mes == 7) || (mes == 12)) {
            System.out.println("Férias");
        }
    }

    private static void atividadeSwitchUm(){
        String diaSemana = "Quinta-feira";

        switch (diaSemana) {
            case "Segunda-feira":
                System.out.println(diaSemana + " é representada pelo número 2");
                break;
            case "Terça-feira":
                System.out.println(diaSemana + " é representada pelo número 3");
                break;
            case "Quarta-feira":
                System.out.println(diaSemana + " é representada pelo número 4");
                break;
            case "Quinta-feira":
                System.out.println(diaSemana + " é representada pelo número 5");
                break;
            case "Sexta-feira":
                System.out.println(diaSemana + " é representada pelo número 6");
                break;
            case "Sábado":
                System.out.println(diaSemana + " é representada pelo número 7");
                break;
            case "Domingo":
                System.out.println(diaSemana + " é representada pelo número 1");
                break;
            default:
                System.out.println("Dia da semana inválido");
                break;
        }
    }

    private static void atividadeSwitchDois(){

        int numero = 2;

        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }

}
