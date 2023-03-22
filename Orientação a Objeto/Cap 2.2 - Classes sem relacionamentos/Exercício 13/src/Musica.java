import java.util.Scanner;

public class Musica {
    private String titulo;
    private String cantor;
    private String tipo;
    private int duracao;
    

    public Musica(String titulo, String cantor,String tipo, int duracao) {
        this.titulo = titulo;
        this.cantor = cantor;
        this.tipo = tipo;
        this.duracao = duracao;
    }
    
    public Musica() {
        titulo = null;
        cantor = null;
        tipo = null;
        duracao = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public void fill() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados do filme: ");

        System.out.print("- Titulo: ");
        this.titulo = sc.nextLine();
        
        System.out.print("- Cantor: ");
        this.cantor = sc.nextLine();

        System.out.print("- Tipo: ");
        this.tipo = sc.nextLine();
        
        System.out.print("- Duracao: ");
        this.duracao = sc.nextInt();
        
    }
    
    public void print() {
        System.out.print("- Titulo: " + this.titulo);
        System.out.print("- Cantor: " + this.cantor);
        System.out.print("- Tipo: " + this.tipo);
        System.out.print("- Duracao: " + this.duracao);        

    }
    
    public void copy(Musica outro) {
        this.titulo = outro.getTitulo();
        this.cantor = outro.getCantor();
        this.tipo = outro.getTipo();
        this.duracao = outro.getDuracao();
    }

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
}
