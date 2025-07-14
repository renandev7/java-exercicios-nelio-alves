import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod1, cod2, numPecas1, numPecas2;
        double valorUnidade1, valorUnidade2, total;

        System.out.println("Qual o codigo da primeira peça? ");
        cod1 = sc.nextInt();
        System.out.println("Quais as quantidades da primeira peça? ");
        numPecas1 = sc.nextInt();
        System.out.println("Qual o valor UNITARIO da primeira peça? ");
        valorUnidade1 = sc.nextDouble();

        System.out.println("Qual o codigo da segunda peça? ");
        cod2 = sc.nextInt();
        System.out.println("Quais as quantidades da segunda peça? ");
        numPecas2 = sc.nextInt();
        System.out.println("Qual o valor UNITARIO da segunda peça? ");
        valorUnidade2 = sc.nextDouble();

        total = numPecas1 * valorUnidade1 + numPecas2 * valorUnidade2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.


