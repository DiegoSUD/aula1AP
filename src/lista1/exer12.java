package lista1;

import java.util.Scanner;

public class exer12 {

    public static void main(String[] args) {
        /*Fazer um algoritmo que leia dois números L e R. O programa deve 
        verificar a maior área entre um quadrado de lado L e um círculo
        de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Circulo".*/
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva um numero para o lado do quadrado");
        double ladoQ, areaQ;
        ladoQ = leitor.nextDouble();
        areaQ = Math.pow(ladoQ, 2);
        System.out.println("Escreva um numero para o raio da circunferência");
        double raioC, areaC;
        raioC = leitor.nextDouble();
        areaC = Math.PI * Math.pow(raioC, 2);
        if (areaQ > areaC) {
            System.out.println("O quandrado é maior em questão"
                    + " de área do que a circunferência");
        } else {
            System.out.println("A circunferência é maior em questão de área do"
                    + " que o quadrado");
        }
    }

}
