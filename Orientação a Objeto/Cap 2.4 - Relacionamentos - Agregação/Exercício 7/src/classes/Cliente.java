package classes;

import java.util.Scanner;

public class Cliente {
  private String nome;
  private String cpf;

  public Cliente() {
    this.nome = null;
    this.cpf = null;
  }

  public Cliente(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public Cliente ( Cliente outro) { copy(outro); }
  public void copiar ( Cliente outro) { copy(outro); }
  public void copy(Cliente outro) {
    this.nome = outro.getNome();
    this.cpf = outro.getCpf();
  }


  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void preencher() { fill(); }
  public void fill()
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe os dados do cliente: ");
    System.out.print("- Nome: ");
    this.nome = sc.nextLine();

    System.out.print("- CPF: ");
    this.cpf = sc.nextLine();

    System.out.print("\n");
  }

  public void print()
  {
    System.out.println("- Nome: " + this.nome);
    System.out.println("- CPF: " + this.cpf);
  }

  public String toString()
  {
    return "Cliente [nome=" + this.nome + ", cpf=" + this.cpf + "]";
  }
}
