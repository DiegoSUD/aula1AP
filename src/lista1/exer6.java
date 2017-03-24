package lista1;

import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        /*6. Escreva um algoritmo que leia três números decimais: 
        A, B e C. Em seguida, calcule e mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (π = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
        f) o perímetro do retângulo que tem lados A e B.*/
        
        
        Scanner leia = new Scanner(System.in);
        double a , b, c, A;
        
        System.out.print("Digite o valor de A: ");
        a = leia.nextDouble();
        System.out.print("Digite o valor de b : ");
        b = leia.nextDouble();
        System.out.print("Digite o valor de c : ");
        c = leia.nextDouble();
        
        // Formula da área do Triangulo é A = (b * h) /2
        A = (a * c)/2;
        System.out.println("Área do triângulo retângulo que"
                + " tem A por base e C por altura = " + A);
        
        //Formula  area do circulo é A = PI * r²
        A = Math.PI*(c*c);
        System.out.println("A área do círculo de raio C = " + A);
        
        //Formula da área do Trapezio é A = (h(B + b )) /2
        A = (c*(a+b))/2;
        System.out.println("a área do trapézio que tem A e B"
                + " por bases e C por altura = " + A );
        
        //Formula da área do Quadrado é A = l² ou A = b*h
       // A = Math.pow(b, 2);
       A = (b*b);
       
        
      
        
    }
    
}
