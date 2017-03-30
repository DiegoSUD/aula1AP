package lista1;

import java.util.Scanner;

public class exer14 {

    public static void main(String[] args) {
        /*Fazer um algoritmo que leia dois números e imprime a divisão do
        maior pelo menor.*/
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero 1");
        double num1;
        num1 = leitor.nextDouble();
        System.out.println("Digite o numero 2");
        double num2, div, div2;
        num2 = leitor.nextDouble();
        div = num1 / num2;
        div2 = num2 / num1;
        if (num1 > num2) {
            System.out.println("O resultado da divisão é " + div);
        } else {
            System.out.println("O resultado da divisão é " + div2);
        }
    }

}
