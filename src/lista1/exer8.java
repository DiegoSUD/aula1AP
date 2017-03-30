package lista1;

import java.util.Scanner;

public class exer8 {

    public static void main(String[] args) {
        /*Fazer um algoritmo que leia quatro números e 
        imprime a média aritmética dos quatro números.*/
        Scanner leitor = new Scanner(System.in);

        // ENTRADA
        System.out.println("Escreva o primeiro numero 1");
        double num1, media1;
        num1 = leitor.nextInt();
        media1 = num1 / 2;
        System.out.println("Escreva o primeiro numero 2");
        double num2, media2;
        num2 = leitor.nextInt();
        media2 = num2 / 2;
        System.out.println("Escreva o primeiro numero 3");
        double num3, media3;
        num3 = leitor.nextInt();
        media3 = num3 / 2;
        System.out.println("Escreva o primeiro numero 4");
        double num4, media4;
        num4 = leitor.nextInt();
        media4 = num4 / 2;
        System.out.printf("As médias dos numreros 1,2,3,4 são "
                + ": %f, %f, %f, %f \n", media1, media2, media3, media4);
    }

}
