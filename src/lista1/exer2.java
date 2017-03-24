package lista1;

import java.util.Scanner;

public class exer2 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        //Tem que ser double pq o a variavel Math.pow é double
        double n1, n2, expo;
        System.out.print("Digite o 1º numero :");
        n1 = leia.nextDouble();
        System.out.print("Digite o 2º numero :");
        n2 = leia.nextDouble();
        expo = Math.pow(n1, n2);
        System.out.println(" RESULTADO : " + expo);
        
    }
    
}
