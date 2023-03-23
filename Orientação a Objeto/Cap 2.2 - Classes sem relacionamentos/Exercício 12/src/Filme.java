import java.util.Scanner;

public class Filme {
    private String titulo;
    private String artista;
    private int duracao;
    private double preco;

    public Filme(String titulo, String artista, int duracao, double preco) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.preco = preco;
    }
    
    public Filme() {
        this.titulo = null;
        this.artista = null;
        this.duracao = 0;
        this.preco = 0;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void fill() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados do filme: ");

        System.out.print("- Titulo: ");
        this.titulo = sc.nextLine();
        
        System.out.print("- Artista: ");
        this.artista = sc.nextLine();
        
        System.out.print("- Duracao: ");
        this.duracao = sc.nextInt();
        
        System.out.print("- Preco: ");
        this.preco = sc.nextDouble();
    }

    public void print() {
        System.out.println("-------- Dados do Filme -------");
        System.out.println("- Titulo: " + this.titulo);
        System.out.println("- Artista: " + this.artista);
        System.out.println("- Duracao: " + this.duracao);        
        System.out.println("- Preco: " + this.preco);
        System.out.println("-------------------------------");
    }
    
    public void copy(Filme outro) {
        this.titulo = outro.getTitulo();
        this.artista = outro.getArtista();
        this.duracao = outro.getDuracao();
        this.preco = outro.getPreco();
    }
}
