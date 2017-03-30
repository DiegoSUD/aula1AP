package lista1;

import java.util.Scanner;

public class exer10 {

    public static void main(String[] args) {
        /*Faça um programa que leia o nome de um vendedor, o seu salário fixo e
        o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que
        este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
        calcular e imprimir o total a receber no final do mês.*/
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome do funcionário");
        String nome;
        nome = leitor.next();
        System.out.println("Qual o salário fixo do vendedor " + nome);
        double salarioF;
        salarioF = leitor.nextDouble();
        System.out.printf("Quanto o vendedor %s vendeu esse mês R$ \n", nome);
        double vendas, porcentagem, salario;
        vendas = leitor.nextDouble();
        porcentagem = (vendas * 15) / 100;
        salario = salarioF + porcentagem;
        System.out.printf("O vendedor %s irá receber um salário no final"
                + "do mês de R$ %.2f \n", nome, salario);
    }

}
