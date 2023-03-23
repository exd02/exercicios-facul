import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    /*
     * Printa um menu de opções (inserção, remoção ou pesquisa) para o usuário e retorna a opção escolhida.
     * @return  1 (inserir), 2 (remover), 3 (search titulo), 4 (search artista)
     */
    public static int optionsMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------- Menu de Opções -------");
        System.out.println("1. Inserir");
        System.out.println("2. Remover");
        System.out.println("3. Pesquisar por titulo");
        System.out.println("4. Pesquisar por artista");
        System.out.println("0. Sair");
        System.out.println("-------------------------------");

        System.out.print("- Insira a opção desejada: ");
        return sc.nextInt();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Filme> listaFilmes;
        listaFilmes = new ArrayList<Filme>();

        
        int option = 0;
        do 
        {
            option = optionsMenu();
            switch (option) {
                case 1:
                    Filme f1 = new Filme();
                    f1.fill();
                    listaFilmes.add(f1);
                break;
                

                case 2:
                    System.out.print("- Informe o titulo do filme: ");
                    String titulo = sc.nextLine();
                    
                    for (int i=0; i<listaFilmes.size(); i++)
                    {
                        Filme fi = listaFilmes.get(i);
                        if (fi.getTitulo().equals(titulo))
                        {
                            System.out.println("Encontrado, removendo filme!");
                            listaFilmes.remove(fi);
                        } else
                            System.out.println("Filme não encontrado!");

                    }
                break;
                
                
                case 3:
                    System.out.print("- Informe o Titulo do filme: ");
                    titulo = sc.nextLine();
                    
                    for (int i=0; i<listaFilmes.size(); i++)
                    {
                        Filme fi = listaFilmes.get(i);
                        if (fi.getTitulo().equals(titulo))
                        {
                            System.out.println("Encontrado!");
                            fi.print();
                        } else
                            System.out.println("Titulo não encontrado!");

                    }
                break;


                case 4:
                    System.out.print("- Informe o Artista do filme: ");
                    String artista = sc.nextLine();
                    
                    for (int i=0; i<listaFilmes.size(); i++)
                    {
                        Filme fi = listaFilmes.get(i);
                        if (fi.getArtista().equals(artista))
                        {
                            System.out.println("Encontrado!");
                            fi.print();
                        } else
                            System.out.println("Artista não encontrado!");

                    }
                break;
            }
        } while (option != 0);
    }
}
