import java.util.Scanner;

public class Roda {
  private String nome;
  private String modelo;
  private double aro;
  private double peso;
  private double suporteMax;
  private Carro carro;

  /* Construtor padrão */
  public Roda () {
    this.nome = null;
    this.modelo = null;
    this.aro = 0.0;
    this.peso = 0.0;
    this.suporteMax = 0.0;
    this.carro = new Carro();
  }

  /* Construtor com parametros */
  public Roda (String nome, String modelo, double aro, double peso, double suporteMax, Carro carro) {
    this.nome = nome;
    this.modelo = modelo;
    this.aro = aro;
    this.peso = peso;
    this.suporteMax = suporteMax;
    this.carro.copiar(carro);
  }

  /* Construtor de cópia */
  public Roda (Roda copia) {
    copiar(copia);
  }

  /* Copia os dados do parametro para o ojeto atual */
  public void copiar (Roda copia) {
    this.nome = copia.getNome();
    this.modelo = copia.getModelo();
    this.aro = copia.getAro();
    this.peso = copia.getPeso();
    this.suporteMax = copia.getSuporteMax();
    this.carro.copiar(copia.getCarro());
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
  public Carro getCarro() {
    return this.carro;
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
  public void setCarro(Carro carro) {
    this.carro.copiar(carro);
  }

   
  // Pede para o usuario dar entrada em todos os dados da roda (Nome, Modelo, Aro, Peso e Suporte Max.)
  public void preencher(Carro carro) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe os dados da roda: \n");

    System.out.print("- Nome: ");
    setNome(sc.nextLine());

    System.out.print("- Modelo: ");
    setModelo(sc.nextLine());

    System.out.print("- Aro: ");
    setAro(sc.nextDouble());

    System.out.print("- Peso: ");
    setPeso(sc.nextDouble());

    System.out.print("- Suporte Maximo: ");
    setSuporteMax(sc.nextDouble());

    this.carro = carro;

    System.out.print("\n");
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

  // Retorna uma string com todos os dados da roda
  public String dadosDaRoda() {
    return (getNome() + " " + getModelo() + " " + getAro() + " " + getPeso() + " " + getSuporteMax());
  }
}
