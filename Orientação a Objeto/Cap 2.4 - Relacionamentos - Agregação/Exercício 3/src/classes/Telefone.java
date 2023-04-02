package classes;

import java.util.Scanner;

public class Telefone {
  private String ddd;
  private String numero;
  private String descricao;
  private String operadora;

  public Telefone()
  {
    this.ddd = null;
    this.numero = null;
    this.descricao = null;
    this.operadora = null;
  }

  public Telefone(String ddd, String numero, String descricao, String operadora)
  {
    this.ddd = ddd;
    this.numero = numero;
    this.descricao = descricao;
    this.operadora = operadora;
  }

  public Telefone(Telefone other)
  {
    copy(other);
  }

  
  public String getDdd() {
    return this.ddd;
  }

  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  public String getNumero() {
    return this.numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getOperadora() {
    return this.operadora;
  }

  public void setOperadora(String operadora) {
    this.operadora = operadora;
  }

  public void copy(Telefone other)
  {
    this.ddd = other.getDdd();
    this.numero = other.getNumero();
    this.descricao = other.getDescricao();
    this.operadora = other.getOperadora();
  }
  public void copiar(Telefone other) { copy(other); }
  
  public void preencher() { fill(); }
  public void fill() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe os dados do numero: \n");

    System.out.print("- DDD: ");
    setDdd(sc.nextLine());

    System.out.print("- Numero: ");
    setNumero(sc.nextLine());

    System.out.print("- Descricao: ");
    setDescricao(sc.nextLine());

    System.out.print("- Operadora: ");
    setOperadora(sc.nextLine());
    
    System.out.print("\n");
  }

  public void imprimir () { print(); }
  public void print()
  {
    System.out.println("- DDD: " + ddd);
    System.out.println("- Numero: " + numero);
    System.out.println("- Descricao: " + descricao);
    System.out.println("- Operadora: " + operadora);
  }

  // Retorna uma String com o ddd, numero e operadora EX.: (32) 99999999 (Operadora)
  public String shortString()
  {
    return ("(" + ddd + ") " + numero + " (" + operadora + ")");
  }
  
}
