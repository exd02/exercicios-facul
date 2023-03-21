/*
 * Exercício 02
 * Leia do teclado um numero inteiro
 * Efetue a soma de todos os impares de 0 até este número
 * Para ler uma informação do teclado é necessário usar a classe SCANNER.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um numero inteiro");
        int num = 0;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int sum = 0;
        for (int i=0; i<=num; i++) {
            if (i%2 != 0)
                sum += i;
        }

        System.out.println("Soma de todos os impares de 0 até este numero = " + sum);
    }
}
