package lista1;

import java.util.Scanner;

public class exer13 {

    public static void main(String[] args) {
        /*Fazer um algoritmo que leia três números e imprime o maior deles*/
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva numero 1");
        double num1;
        num1 = leitor.nextDouble();
        System.out.println("Escreva numero 2");
        double num2;
        num2 = leitor.nextDouble();
        System.out.println("Escreva numero 3");
        double num3;
        num3 = leitor.nextDouble();
        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior dentre eles é o numero " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior dentre eles é o numero " + num2);
        } else {
            System.out.println("O maior dentre eles é o numero " + num3);
        }
    }

}
