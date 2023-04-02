package classes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
  private String nome;
  private String matricula;
  private String email;
  private String curso;
  private List<Telefone> listTelefones;

  public Aluno() {
    this.nome = null;
    this.matricula = null;
    this.email = null;
    this.curso = null;
    this.listTelefones = new ArrayList<Telefone>();
  }

  public Aluno(String nome, String matricula, String email, String curso, List<Telefone> listTelefones) {
    this.nome = nome;
    this.matricula = matricula;
    this.email = email;
    this.curso = curso;
    // Testar se isso funciona ou se vai ter que fazer um laço
    this.listTelefones = listTelefones;
  }

  public Aluno(Aluno other)
  {
    copy(other);
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCurso() {
    return this.curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public List<Telefone> getListTelefones() {
    return this.listTelefones;
  }

  public void setListTelefones(List<Telefone> listTelefones) {
    this.listTelefones = listTelefones;
  }

  public void copiar(Aluno other) { copy(other); }
  public void copy(Aluno other)
  {
    this.nome = other.getNome();
    this.matricula = other.getMatricula();
    this.email = other.getEmail();
    this.curso = other.getCurso();
    this.listTelefones = other.getListTelefones();
  }

  public void preencher() { fill(); }
  public void fill() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe os dados do aluno: \n");

    System.out.print("- Nome: ");
    setNome(sc.nextLine());

    System.out.print("- Matricula: ");
    setMatricula(sc.nextLine());

    System.out.print("- Email: ");
    setEmail(sc.nextLine());

    System.out.print("- Curso: ");
    setCurso(sc.nextLine());


    List<Telefone> listTel;
    listTel = new ArrayList<Telefone>();
    char option = 's';
    do
    {
      System.out.print("- Adicionar telefone? (s/n): ");
      option = sc.next().charAt(0);

      if (option == 'n')
        break;

      Telefone tel = new Telefone();
      tel.fill();
      
      listTel.add(tel);

    } while (option != 'n');
    this.listTelefones = listTel;
    
    System.out.print("\n");
  }

  public void imprimir() { print(); }
  public void print() {
    System.out.print("Dados do Aluno: \n");
    System.out.println("- Nome: " + nome);
    System.out.println("- Matricula: " + matricula);
    System.out.println("- Email: " + email);
    System.out.println("- Curso: " + curso);
    for (int i=0; i<listTelefones.size(); i++) {
      System.out.println("- Numero [" + i + "]: " + listTelefones.get(i).shortString());
    }
  }
}
