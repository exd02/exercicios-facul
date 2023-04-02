package classes;

import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

public class PF {
  private String nome;
  private String cpf;
  private String email;
  private List<Contas_a_pagar> listContasPag;

  public PF() {
    this.nome = null;
    this.cpf = null;
    this.email = null;
    this.listContasPag = new ArrayList<Contas_a_pagar>();
  }

  public PF( String nome, String cpf, String email, List<Contas_a_pagar> listcontasPag) {
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.listContasPag = listcontasPag;
  }

  public PF ( PF outro) { copy(outro); }
  public void copiar ( PF outro) { copy(outro); }
  public void copy(PF outro) {
    this.nome = outro.getNome();
    this.cpf = outro.getCpf();
    this.email = outro.getEmail();
    this.listContasPag = outro.getListContasPag();
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

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Contas_a_pagar> getListContasPag() {
    return this.listContasPag;
  }

  public void setListContasPag(List<Contas_a_pagar> listContasPag) {
    this.listContasPag = listContasPag;
  }

  public void fill()
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe os dados da Pessoa Física: ");
    System.out.print("- Nome: ");
    this.nome = sc.nextLine();

    System.out.print("- CPF: ");
    this.cpf = sc.nextLine();

    System.out.print("- Email: ");
    this.email = sc.nextLine();

    List<Contas_a_pagar> list_cp = new ArrayList<Contas_a_pagar>();

    char option = 's';
    do
    {
      System.out.print("Deseja inserir 'Conta a Pagar'? (s/n): ");
      option = sc.next().charAt(0);

      if (option == 'n')
        break;

      Contas_a_pagar cp = new Contas_a_pagar();
      cp.fill();

      list_cp.add(cp);

    } while (option != 'n');

    this.listContasPag = list_cp;

    System.out.print("\n");
  }

  public void print()
  {
    System.out.print("- Nome: ");
    System.out.print("- CPF: ");
    System.out.print("- Email: ");
    for (int i=0; i<this.listContasPag.size(); i++)
    {
      System.out.print("- Contas a Pagar [" + i + "]: " + this.listContasPag.get(i).shortString());
    }
  }
}
