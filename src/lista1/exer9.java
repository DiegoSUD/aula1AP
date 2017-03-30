package lista1;

import java.util.Scanner;

public class exer9 {

    public static void main(String[] args) {
        /*Escreva um programa que leia o número de cadastro de um funcionário,
        seu número de horas trabalhadas, o valor que recebe por hora e calcula
        o salário desse funcionário. A seguir, mostre na tela o número e o
        salário do funcionário.*/
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva o numero de cadastro do funcionario");
        int numCadastro;
        numCadastro = leitor.nextInt();
        System.out.println("Escreva as horas trabalhadas"
                + " por dia do funcionário");
        double horasT;
        horasT = leitor.nextDouble();
        System.out.println("Quanto ele recebe por hora");
        double valorH;
        valorH = leitor.nextDouble();
        System.out.println("O salário desse funcionário é ");
        double salario;
        salario = (horasT * valorH) * 30;
        System.out.printf("O fucionario de Cadastro %d recebe o "
                + "salário de R$ %.2f \n", numCadastro, salario);
    }

}
