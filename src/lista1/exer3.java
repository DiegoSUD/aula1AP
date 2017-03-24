package lista1;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double n1, n2, Result1,Result2, vQuadrado;
        System.out.print(" Digite o 1º numero :");
        n1 = leia.nextDouble();
        System.out.print(" Digite o 2º numero :");
        n2 = leia.nextDouble();
        Result1 = Math.pow(n1, 2);
        Result2 = Math.pow(n2, 2);
        vQuadrado = Result1 + Result2;
        System.out.println("Resultado do Problema :" + vQuadrado);
        
    }
    
}
