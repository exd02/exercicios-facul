import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Filme> listaFilmes;
        listaFilmes = new ArrayList<Filme>();

        
        int option = 0;
        do 
        {
            option = Filme.optionsMenu();
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
