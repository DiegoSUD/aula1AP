package lista1;

import java.util.Scanner;

public class exer11 {

    public static void main(String[] args) {
        /*Fazer um algoritmo que lê um número e verifica se ele é negativo.
        Se for negativo, imprimir na tela a mensagem "Numero negativo". */
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero");
        double num;
        num = leitor.nextDouble();
        if (num < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Numero Possivo");
        }
    }

}
