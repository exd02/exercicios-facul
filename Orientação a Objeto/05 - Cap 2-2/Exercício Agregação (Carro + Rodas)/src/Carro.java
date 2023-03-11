import java.util.Scanner;

public class Carro {
  private String marca;
  private String nome;
  private String cor;
  private int ano;
  private Roda[] rodas;

  public Carro() {
    this.marca = null;
    this.nome = null;
    this.cor = null;
    this.ano = 0;
    this.rodas = new Roda[4];
  }
  
  public Carro (String marca, String nome, String cor, int ano, Roda rodas) {
    this.marca = marca;
    this.nome = nome;
    this.cor = cor;
    this.ano = ano;
    for (int i=0; i<=3; i++) {
     this.rodas[i].copiar(rodas);
    }
  }

  // Construtor de Cópia
  public Carro (Carro copiarCarro) {
    this.marca = copiarCarro.marca;
    this.nome = copiarCarro.nome;
    this.cor = copiarCarro.cor;
    this.ano = copiarCarro.ano;
    for (int i=0; i<=3; i++) {
      this.rodas[i].copiar(copiarCarro.getRodas()[i]);
    }
  }

  public void copiar (Carro copiarCarro) {
    this.marca = copiarCarro.marca;
    this.nome = copiarCarro.nome;
    this.cor = copiarCarro.cor;
    this.ano = copiarCarro.ano;
    for (int i=0; i<=3; i++) {
      this.rodas[i].copiar(copiarCarro.getRodas()[i]);
    }
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
  public Roda[] getRodas() {
    return this.rodas;
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
  // Setar todas as rodas usando um array
  public void setRodas (Roda rodas[]) {
    this.rodas = rodas;
  }
  // Setar uma única roda usando o index
  public void setRoda (int i, Roda roda) {
    this.rodas[i] = roda;
  }
  

  // Printa os dados do carro
  public void print() {
    System.out.print("Dados do carro: \n");
    System.out.println("- Marca: " + getMarca());
    System.out.println("- Nome: " + getNome());
    System.out.println("- Cor: " + getCor());
    System.out.println("- Ano: " + getAno());
    for (int i=0; i<=3; i++) {
      System.out.println("- Roda[" + i + "]: " + getRodas()[i].dadosDaRoda());
    }
  }

  // Pede para o usuario dar entrada em todos os dados do carro
  public void preencher() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe os dados do carro: \n");

    System.out.print("- Marca: ");
    setMarca(sc.nextLine());

    System.out.print("- Nome: ");
    setNome(sc.nextLine());

    System.out.print("- Cor: ");
    setCor(sc.nextLine());

    System.out.print("- Ano: ");
    setAno(sc.nextInt());

    Roda r = new Roda();
    for (int i=0; i<=3; i++) {
      r.preencher();
      setRoda(i, r);
    }
    
    System.out.print("\n");
    sc.close();
  }
}
