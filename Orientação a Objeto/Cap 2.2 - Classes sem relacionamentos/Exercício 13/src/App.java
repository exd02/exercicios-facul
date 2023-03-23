import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    /*
     * Printa um menu de opções (inserção, remoção ou pesquisa) para o usuário e retorna a opção escolhida.
     * @return  1 (inserir), 2 (remover),3 (search titulo), 4 (search cantor), 5 (search tipo)
     */
    public static int optionsMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------- Menu de Opções -------");
        System.out.println("1. Inserir");
        System.out.println("2. Remover");
        System.out.println("3. Pesquisar por titulo");
        System.out.println("4. Pesquisar por cantor");
        System.out.println("5. Pesquisar por tipo");
        System.out.println("0. Sair");
        System.out.println("-------------------------------");

        System.out.print("- Insira a opção desejada: ");
        return sc.nextInt();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Musica> listaMusicas;
        listaMusicas = new ArrayList<>();

        int option = 0;
        do 
        {
            option = optionsMenu();
            
            switch (option) {
                case 1:
                    Musica m1 = new Musica();
                    m1.fill();
                    listaMusicas.add(m1);
                break;


                case 2:
                    System.out.print("- Informe o titulo da Musica: ");
                    String titulo = sc.nextLine();
                    
                    for (int i=0; i<listaMusicas.size(); i++)
                    {
                        Musica mi = listaMusicas.get(i);
                        if (mi.getTitulo().equals(titulo))
                        {
                            System.out.println("Encontrado, removendo Musica!");
                            listaMusicas.remove(mi);
                        } else
                            System.out.println("Musica não encontrada!");

                    }
                break;


                case 3:
                    System.out.print("- Informe o titulo da Musica: ");
                    titulo = sc.nextLine();
                    
                    for (int i=0; i<listaMusicas.size(); i++)
                    {
                        Musica mi = listaMusicas.get(i);
                        if (mi.getTitulo().equals(titulo))
                        {
                            System.out.println("Encontrado!");
                            mi.print();
                        } else
                            System.out.println("Musica não encontrada!");

                    }
                break;


                case 4:
                    System.out.print("- Informe o cantor da Musica: ");
                    String cantor = sc.nextLine();
                    
                    for (int i=0; i<listaMusicas.size(); i++)
                    {
                        Musica mi = listaMusicas.get(i);
                        if (mi.getCantor().equals(cantor))
                        {
                            System.out.println("Encontrado!");
                            mi.print();
                        }
                        else
                            System.out.println("Musica não encontrada!");
                    }
                break;

                
                case 5:
                    System.out.print("- Informe o genero (tipo) da Musica: ");
                    String tipo = sc.nextLine();
                    
                    for (int i=0; i<listaMusicas.size(); i++)
                    {
                        Musica mi = listaMusicas.get(i);
                        if (mi.getTipo().equals(tipo))
                        {
                            System.out.println("Encontrado!");
                            mi.print();
                        }
                        else
                            System.out.println("Musica não encontrada!");
                    }
                break;
            }


        } while (option != 0);
    }
}
