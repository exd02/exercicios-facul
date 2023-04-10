package classes;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
  private static int nextId = 1;
  private int id;
  private Cliente cliente;
  private List<Produto> carrinho;

  public Pedido()
  {
    this.id = nextId++;
    this.cliente = new Cliente();
    this.carrinho = new ArrayList<Produto>();
  }

  public Pedido(Cliente cliente, List<Produto> carrinho)
  {
    this.id = nextId++;
    this.cliente = cliente;
    this.carrinho = carrinho;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Cliente getCliente() {
    return this.cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public List<Produto> getCarrinho() {
    return this.carrinho;
  }

  public void setCarrinho(List<Produto> carrinho) {
    this.carrinho = carrinho;
  }

  /* retorna uam string com todos os IDs dos produtos do carrinho */
  public String stringIdsCarrinho() {
    String ids = "";
    for (Produto p : this.carrinho) {
      ids = ids + p.getId() + " ";
    }
    return ids.trim();
  }

  public String toString()
  {
    return "Pedido [id=" + this.id + ", cliente=" + this.cliente.getNome() + ", Carrinho=" + stringIdsCarrinho() + "]";
  }

  public double getFaturamento()
  {
    double faturamento = 0;
    for(Produto produto : this.carrinho) {
      faturamento += produto.getValor();
    }
    return faturamento;
  }
}
