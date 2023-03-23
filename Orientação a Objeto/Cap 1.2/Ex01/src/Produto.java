public class Produto {
  private String nome;
  private int qtd;

  public Produto() {
    this.nome = null;
    this.qtd = 0;
  }
  public Produto(String nome, int qtd) {
    this.nome = nome;
    this.qtd = qtd;
  }

  //getters
  public String getNome() {
    return this.nome;
  }
  public int getQtd() {
    return this.qtd;
  }

  //setters
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setQtd(int qtd) {
    this.qtd = qtd;
  }

}
