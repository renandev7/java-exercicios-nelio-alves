import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor, raio, pi = 3.14159;

        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();
        valor = pi * (raio * raio);

        System.out.printf("A=%.4f%n", valor);

        sc.close();
    }
}
//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159



