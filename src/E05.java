/* 5. Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e
os salários, e devolvendo a média salarial.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("-------------- MÉDIA SALARIAL DA EMPRESA --------------");

        System.out.print("\nInforme a quantidade funcionários da empresa: ");
        int qntFuncionarios = entradaDoUsuario.nextInt();

        //matriz com o tamanho "qntFuncionarios" que vai armazenar o nome e salário de cada um;
        String[][] matrizFuncionarios = new String[qntFuncionarios][2];

        double somaSalario = 0;
        DecimalFormat df = new DecimalFormat("#.##");

        //loop para solicitar o nome e salario do funcionário, armazenando ambos em variáveis e na matriz
        for (int i = 0; i < qntFuncionarios; i++) {
            System.out.print("Informe o nome do funcionário: ");
            String nome = (entradaDoUsuario.next());
            matrizFuncionarios[i][0] = nome;

            System.out.print("Informe o salário do funcionário: R$");
            double salarioFuncionario = entradaDoUsuario.nextDouble();
            matrizFuncionarios[i][1] = String.valueOf(salarioFuncionario);

            somaSalario += salarioFuncionario;
        }

        System.out.println("\n------ GRADE DE FUNCIONARIOS X SALÁRIOS ------ ");
        for (int i = 0; i < qntFuncionarios; i++) {
            String nome = matrizFuncionarios[i][0];
            String salarioFuncionario = matrizFuncionarios[i][1];
            System.out.println("\nFuncionario(a): " + nome + "\nSalário: R$" + salarioFuncionario);
        }

        double mediaSalarial = somaSalario / qntFuncionarios;
        System.out.println("\nA média salarial dos funcionarios da sua empresa é: R$" + df.format(mediaSalarial));
    }
}
