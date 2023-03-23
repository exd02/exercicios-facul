/*
 * ### Exercício 01
 * Faça um programa em java que leia do teclado **dois** números reais
 * Informe o **maior** deles.
 * Para ler uma informação do teclado é necessário usar a classe SCANNER.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite dois numeros inteiros");
        Scanner sc = new Scanner(System.in);
        
        int n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        
        System.out.println("O maior numero digitado eh " + ((n1 > n2) ? n1 : n2));
    }
}
