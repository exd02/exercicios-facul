public class Carro {
  private String marca;
  private String nome;
  private String cor;
  private int ano;

  public Carro() {
    this.marca = null;
    this.nome = null;
    this.cor = null;
    this.ano = 0;
  }
  
  public Carro (String marca, String nome, String cor, int ano) {
    this.marca = marca;
    this.nome = nome;
    this.cor = cor;
    this.ano = ano;
  }

  // Construtor de Cópia
  public Carro (Carro copia) {
    this.marca = copia.marca;
    this.nome = copia.nome;
    this.cor = copia.cor;
    this.ano = copia.ano;
  }

  public void copiar (Carro copia) {
    this.marca = copia.marca;
    this.nome = copia.nome;
    this.cor = copia.cor;
    this.ano = copia.ano;
  }

  //Getters
  public String getMarca() {
    return this.marca;
  }
  public String getNome() {
    return this.nome;
  }
  public String getCor() {
    return this.cor;
  }
  public int getAno() {
    return this.ano;
  }

  //Setters
  public void setMarca (String marca) {
    this.marca = marca;
  }
  public void setNome (String nome) {
    this.nome = nome;
  }
  public void setCor (String cor) {
    this.cor = cor;
  }
  public void setAno (int ano) {
    this.ano = ano;
  }
}
