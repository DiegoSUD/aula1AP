package lista1;

import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double n1, n2, Vlor1, Vlor2;
        System.out.print("Digite o 1º valor :");
        n1 = leia.nextDouble();
        System.out.print("Digite o 2º valor :");
        n2 = leia.nextDouble();
        Vlor1 = n1+1;
        Vlor2 = n2+1;
        System.out.println("Resultado :" + Vlor1 + " e " + Vlor2);
        
    }
    
}
