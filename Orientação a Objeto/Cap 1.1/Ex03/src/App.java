import java.util.Scanner;

/*
 * ### Exercício 03
 * Entre com o nome de dois alunos
 * Verifique se eles tem o mesmo nome.
 * Caso na tenham o mesmo nome informe qual dos dois tem maior número de caracteres.
 * Dica: use os métodos da classe **string**
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno 1:");
        String aluno1;
        aluno1 = sc.nextLine();

        System.out.println("Digite o nome do aluno 2:");
        String aluno2;
        aluno2 = sc.nextLine();
        
        if (aluno1.equals(aluno2))
            System.out.println("Ambos tem o mesmo nome");
        else {
            if (aluno1.length() == aluno2.length())
                System.out.println("Nomes diferentes, mesma quantidade de caracteres");
            else if (aluno1.length() > aluno2.length())
                System.out.println("'" + aluno1 + "'" + " tem " + (aluno1.length() - aluno2.length()) + " caracteres a mais do que " + "'" + aluno2 + "'");
            else 
                System.out.println("'" + aluno2 + "'" + " tem " + (aluno2.length() - aluno1.length()) + " caracteres a mais do que " + "'" + aluno1 + "'");
        }

        sc.close();
    }
}
