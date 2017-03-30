package lista1;

import java.util.Scanner;

public class exer15 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva o valor de A");
        double a;
        a = leitor.nextDouble();
        System.out.println("Escreva o valor de B");
        double b;
        b = leitor.nextDouble();
        System.out.println("Escreva o valor de C");
        double c;
        c = leitor.nextDouble();
        double delta, x1, x2;
        delta =( Math.pow(b, 2)) - (4 * a * c);
        System.out.println("delta = " +  delta);
        x1 = (-b + Math.sqrt(delta))/ (2 * a);
        x2 = (-b - Math.sqrt(delta))/ (2 * a); 
        if (delta <= 0){System.out.println("Impossivel Calcular");}else {
            System.out.printf("O valor de x1 é %.2f e o valor"
                    + " de x2 é %.2f \n", x1, x2);
        } 
    }

}
