package lista1;

import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double l, result;
        System.out.print("Digite o valor do lado do quadrado :");
        l = leia.nextDouble();
        result = Math.pow(l, 2);
        System.out.println("A área do quadrado é :" + result);
        
        System.out.println("fim");
    }
    
}
