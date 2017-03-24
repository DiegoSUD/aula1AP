
package lista1;

import java.util.Scanner;

public class exer1 {

 
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int n1 , n2, mult;
        System.out.print("Coloque o primeiro numero :");
        n1 = leia.nextInt();
        System.out.print("Coloque o segundo numero :");
        n2 = leia.nextInt();
        mult = n1*n2;
        System.out.println("Resultado da Multiplicação : " + mult);
        System.out.println("**FIM**");
                
 
    }
    
}
