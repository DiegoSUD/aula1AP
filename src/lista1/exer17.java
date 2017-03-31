package lista1;

import java.util.Scanner;

public class exer17 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int a;
        a = leitor.nextInt();
        System.out.println("Digite o valor de B");
        int b;
        b = leitor.nextInt();
        System.out.println("Digite o valor de C");
        int c;
        c = leitor.nextInt();
        System.out.println("Digite o valor de D");
        int d;
        d = leitor.nextInt();
        int T1, T2;
        T1 = a + b;
        T2 = c + d;
        if ((b > c) && (d > a) && (T2 > T1) && (c > 0) && (d > 0) && (a % 2 == 0)) {
            System.out.println("Valores Aceito");
        } else {
            System.out.println("Valores não Aceitos");
        }
    }

}
