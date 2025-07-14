import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1, val2, soma;

        System.out.println("Digite o primeiro valor: ");
        val1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        val2 = sc.nextInt();

        soma = val1 + val2;

        System.out.printf("A soma dos dois numeros, é igual a: %d%n", soma);

        sc.close();
    }
}
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

