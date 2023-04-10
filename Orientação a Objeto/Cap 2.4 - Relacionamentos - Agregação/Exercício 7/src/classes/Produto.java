package classes;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Produto {
  private static int nextId = 1;
  private int id;
  private String nome;
  private double valor;

  public Produto() {
    this.id = nextId++;
    this.nome = null;
    this.valor = 0.0;
  }

  public Produto(String nome, int qtd, double valor) {
    this.id = nextId++;
    this.nome = nome;
    this.valor = valor;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }
  
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getValor() {
    return this.valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public Produto (Produto outro) { copy(outro); }
  public void copiar (Produto outro) { copy(outro); }
  public void copy (Produto outro) {
    this.nome = outro.getNome();
    this.valor = outro.getValor();
  }

  public void preencher() { fill(); }
  public void fill()
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe os dados do Produto: ");
    System.out.print("- Nome: ");
    this.nome = sc.nextLine();

    System.out.print("- Valor: ");
    this.valor = sc.nextDouble();

    System.out.print("\n");
  }

  public String toString() {
    DecimalFormat df = new DecimalFormat("#.00");
    return "Produto [id=" + this.id + ", nome=" + this.nome + " valor=" + df.format(this.valor) + "]";
  }
}
