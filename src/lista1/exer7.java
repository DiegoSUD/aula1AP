package lista1;

import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double a, b, h, R, Ra, Rb;     
        System.out.print("Escreva o valor de A : ");
        a = leitor.nextDouble();
        System.out.print("Escreva o valor de B : ");
        b = leitor.nextDouble();
        Ra = Math.pow(a, 2);
        Rb = Math.pow(b, 2);
        R = Ra + Rb;
        h = Math.sqrt(R);
        System.out.print("A hipotenusa de um triângulo "
                + "retângulo com lados A, B é = " + h + "\n\r");
    }
    
}
