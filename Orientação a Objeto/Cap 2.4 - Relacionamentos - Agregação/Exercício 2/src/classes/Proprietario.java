package classes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Proprietario {
  private String nome;
  private String cpf;
  private String email;
  private List<Carro> listCarro;

  public Proprietario () {
    this.nome = null;
    this.cpf = null;
    this.email = null;
    this.listCarro = new ArrayList<Carro>();
  }

  public Proprietario (String nome, String cpf, String email, List<Carro> listCarro) {
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    for (int i=0; i<listCarro.size(); i++) {
      this.listCarro.get(i).copiar(listCarro.get(i));
    }
  }

  // Getters
  public String getNome() {
    return nome;
  }
  public String getCpf() {
    return cpf;
  }
  public String getEmail() {
    return email;
  }
  public List<Carro> getListCarros() {
    return listCarro;
  }

  // Setters
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setListCarros(List<Carro> listCarro) {
    for (int i=0; i<listCarro.size(); i++) {
      this.listCarro.get(i).copiar(listCarro.get(i));
    }
  }

  public void addCarroParaLista(Carro carro)
  {
    listCarro.add(carro);
  }

  public void fill() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe os dados do proprietário: \n");

    System.out.print("- Nome: ");
    setNome(sc.nextLine());

    System.out.print("- CPF: ");
    setCpf(sc.nextLine());

    System.out.print("- Email: ");
    setEmail(sc.nextLine());
    
    System.out.print("\n");
  }

  public void print() {
    System.out.print("Dados do Proprietario: \n");
    System.out.println("- Nome: " + nome);
    System.out.println("- CPF: " + cpf);
    System.out.println("- Email: " + email);
    for (int i=0; i<listCarro.size(); i++) {
      System.out.println("- Carro(s) [" + i + "]: " + listCarro.get(i).shortPrint());
    }
  }
}
