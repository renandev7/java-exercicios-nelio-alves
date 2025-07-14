import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroFuncionario, horasTrabalhadas;
        double valorPorHora, total;

        System.out.println("Qual o seu numero de funcionario? ");
        numeroFuncionario = sc.nextInt();
        System.out.println("Quantas horas voce trabalhou? ");
        horasTrabalhadas = sc.nextInt();
        System.out.println("Qual o valor que voce recebe por hora? ");
        valorPorHora = sc.nextDouble();

        total = horasTrabalhadas * valorPorHora;

        System.out.printf("NUMERO = %d%nSALARIO = R$ %.2f%n", numeroFuncionario, total);

        sc.close();
    }
}
//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais

