import java.util.Scanner;

public class Roda {
  private String nome;
  private String modelo;
  private double aro;
  private double peso;
  private double suporteMax;

  /* Construtor padrão */
  public Roda () {
    this.nome = null;
    this.modelo = null;
    this.aro = 0.0;
    this.peso = 0.0;
    this.suporteMax = 0.0;
  }

  /* Construtor com parametros */
  public Roda (String nome, String modelo, double aro, double peso, double suporteMax) {
    this.nome = nome;
    this.modelo = modelo;
    this.aro = aro;
    this.peso = peso;
    this.suporteMax = suporteMax;
  }

  /* Construtor de cópia */
  public Roda (Roda copia) {
    this.nome = copia.getNome();
    this.modelo = copia.getModelo();
    this.aro = copia.getAro();
    this.peso = copia.getPeso();
    this.suporteMax = copia.getSuporteMax();
  }

  /* Copia os dados do parametro para o ojeto atual */
  public void copiar (Roda copia) {
    this.nome = copia.getNome();
    this.modelo = copia.getModelo();
    this.aro = copia.getAro();
    this.peso = copia.getPeso();
    this.suporteMax = copia.getSuporteMax();
  }

  // Getters
  public String getNome() {
    return this.nome;
  }
  public String getModelo() {
    return this.modelo;
  }
  public double getAro() {
    return this.aro;
  }
  public double getPeso() {
    return this.peso;
  }
  public double getSuporteMax() {
    return this.suporteMax;
  }

  // Setters
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public void setAro(double aro) {
    this.aro = aro;
  }
  public void setPeso(double peso) {
    this.peso = peso;
  }
  public void setSuporteMax(double suporteMax) {
    this.suporteMax = suporteMax;
  }

   
  // Pede para o usuario dar entrada em todos os dados da roda (Nome, Modelo, Aro, Peso e Suporte Max.)
  public void preencher() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe os dados da roda: \n");

    System.out.print("- Nome: ");
    this.nome = sc.nextLine();

    System.out.print("- Modelo: ");
    this.modelo = sc.nextLine();

    System.out.print("- Aro: ");
    this.aro = sc.nextDouble();

    System.out.print("- Peso: ");
    this.peso = sc.nextDouble();

    System.out.print("- Suporte Maximo: ");
    this.suporteMax = sc.nextDouble();

    System.out.print("\n");
    sc.close();
  }

  // Printar todos os dados da roda (Nome, Modelo, Aro, Peso e Suporte Max.)
  public void print() {
    System.out.print("Informando os dados da roda: \n");
    System.out.print("- Nome: " + getNome() + "\n");
    System.out.print("- Modelo: " + getModelo() + "\n");
    System.out.print("- Aro: " + getAro() + "\n");
    System.out.print("- Peso: " + getPeso() + "\n");
    System.out.print("- Suporte Maximo: " + getSuporteMax() + "\n");
  }

  // Chama a função print()
  public void imprimir() {
    print();
  }
}
