package classes;

import java.util.Scanner;

public class Contas_a_pagar {
  private int id;
  private String codigoBarras;
  private double valor;


  public Contas_a_pagar() {
    id = -1;
    codigoBarras = null;
    valor = 0;
  }

  public Contas_a_pagar(int id, String codigoBarras, double valor)
  {
    this.id = id;
    this.codigoBarras = codigoBarras;
    this.valor = valor;
  }

  public Contas_a_pagar (Contas_a_pagar outro) { copy(outro); }
  public void copiar (Contas_a_pagar outro) { copy(outro); }
  public void copy(Contas_a_pagar outro)
  {
    this.id = outro.getId();
    this.codigoBarras = outro.getCodigoBarras();
    this.valor = outro.getValor();
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCodigoBarras() {
    return this.codigoBarras;
  }

  public void setCodigoBarras(String codigoBarras) {
    this.codigoBarras = codigoBarras;
  }

  public double getValor() {
    return this.valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public void fill()
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe os dados da Conta a Pagar: ");
    System.out.print("- Codigo de Barras: ");
    this.codigoBarras = sc.nextLine();
    
    System.out.print("- ID: ");
    this.id = sc.nextInt();

    System.out.print("- Valor: ");
    this.valor = sc.nextDouble();
  }

  public void imprimir() { print(); }
  public void print()
  {
    System.out.print("- ID: " + this.id);
    System.out.print("- Codigo de Barras: " + this.codigoBarras);
    System.out.print("- Valor: " + this.valor);
  }
  // retorna uma string curta com os dados da conta a pagar
  public String shortString()
  {
    return "[" + this.id + "] Cod. (" + this.codigoBarras + ") - R$ " + this.valor;
  }
}
