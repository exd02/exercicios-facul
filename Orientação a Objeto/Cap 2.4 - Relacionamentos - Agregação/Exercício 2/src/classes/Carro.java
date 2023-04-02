package classes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Carro {
  private String marca;
  private String nome;
  private String cor;
  private int ano;
  private List<Roda> listRodas;

  public Carro() {
    this.marca = null;
    this.nome = null;
    this.cor = null;
    this.ano = 0;
    listRodas = new ArrayList<Roda>();
  }
  
  public Carro (String marca, String nome, String cor, int ano, List<Roda> listRodas) {
    this.marca = marca;
    this.nome = nome;
    this.cor = cor;
    this.ano = ano;
    for (int i=0; i<listRodas.size(); i++) {
      this.listRodas.get(i).copiar(listRodas.get(i));
    }
  }

  // Construtor de Cópia
  public Carro (Carro copiarCarro) {
    this.marca = copiarCarro.marca;
    this.nome = copiarCarro.nome;
    this.cor = copiarCarro.cor;
    this.ano = copiarCarro.ano;
    for (int i=0; i<=copiarCarro.getListRoda().size(); i++) {
      this.listRodas.add(copiarCarro.getListRoda().get(i));
    }
  }

  public void copiar (Carro copiarCarro) {
    this.marca = copiarCarro.marca;
    this.nome = copiarCarro.nome;
    this.cor = copiarCarro.cor;
    this.ano = copiarCarro.ano;
    for (int i=0; i<this.listRodas.size(); i++) {
      this.listRodas.get(i).copiar(copiarCarro.getListRoda().get(i));
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
  public List<Roda> getListRoda() {
    return this.listRodas;
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
  public void setListRoda (List<Roda> listRoda) {
    for (int i=0; i<listRoda.size(); i++)
    {
      this.listRodas.get(i).copiar(listRoda.get(i));;
    }
  }

  public void imprimir() { print(); }
  public void print() {
    System.out.print("Dados do carro: \n");
    System.out.println("- Marca: " + marca);
    System.out.println("- Nome: " + nome);
    System.out.println("- Cor: " + cor);
    System.out.println("- Ano: " + ano);
    for (int i=0; i<listRodas.size(); i++) {
      System.out.println("- Roda[" + i + "]: " + listRodas.get(i).shortPrint());
    }
  }

  public String shortPrint()
  {
    return (nome + ", " + marca + ", " + cor + ", " + ano + " (4x " + listRodas.get(0).shortPrint() + ")");
  }

  // Pede para o usuario dar entrada em todos os dados do carro
  public void fill() {
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
    
    
    for (int i=0; i<=3; i++) {
      Roda r = new Roda();
      r.fill();
      listRodas.add(r);
    }
    
    System.out.print("\n");
  }
}
